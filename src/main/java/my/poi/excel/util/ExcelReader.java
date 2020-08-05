package my.poi.excel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.poi.excel.model.ExcelDataVo;
import my.poi.excel.phpapi.BaiduDateApiUtil;
import my.poi.excel.phpapi.model.DataModel;
import my.poi.excel.util.Constant.workType;

public class ExcelReader {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExcelReader.class.getName());
	
	private static final String XLS = "xls";
	private static final String XLSX = "xlsx";
	
	/**
	 * 根据文件后缀名类型获取对应的工作簿对象
	 * @param inputStream 读取文件的输入流
	 * @param fileType 文件后缀名类型
	 * @return 包含文件数据的工作簿对象
	 * @throws IOException
	 */
	public static Workbook getWorkbook(InputStream inputStream, String fileType) throws IOException {
		Workbook workbook = null;
		if(fileType.equalsIgnoreCase(XLS)) {
			workbook = new HSSFWorkbook(inputStream);
		} else if(fileType.equalsIgnoreCase(XLSX)) {
			workbook = new XSSFWorkbook(inputStream);
		}
		return workbook;
	}
	
	public static List<ExcelDataVo> readExcel(String fileName, String year, String month) {
		
		Workbook workbook = null;
		FileInputStream inputStram = null;
		
		try {
			
			// 获取Excel后缀名
			String fileType = fileName.substring(fileName.lastIndexOf('.') + 1);
			// 获取Excel文件
			File excelFile = new File(fileName);
			if(!excelFile.exists()) {
				LOGGER.warn("指定的Excel文件不存在");
				return null;
			}
			
			// 获取Excel工作簿
			inputStram = new FileInputStream(excelFile);
			workbook = getWorkbook(inputStram, fileType);
			
			// 读取Excel中的数据
			List<ExcelDataVo> resultList = parseExcel(workbook, year, month);
			
			for(ExcelDataVo vo : resultList) {
				System.out.println(vo.toString());
			}
			
			return resultList;
		} catch (IOException e) {
			LOGGER.error("解析Excel失败，文件名：" + fileName + " 错误信息：" + e.getMessage());
			return null;
		} finally {
			try {
				if(null != workbook) {
					workbook.close();
				}
				if(null != inputStram) {
					inputStram.close();
				}
			} catch (IOException e) {
				LOGGER.error("关闭流数据失败，错误信息：" + e.getMessage());
			}
		}
	}
	
	/**
	  * 根据行信息 组装输出对象
	 * @param workbook
	 * @return
	 */
	public static List<ExcelDataVo> parseExcel(Workbook workbook, String year, String month) {
		List<ExcelDataVo> resultList = new ArrayList<ExcelDataVo>();
		// 解析sheet
		for (int sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); sheetNum++) {
			Sheet sheet = workbook.getSheetAt(sheetNum);
			
			if(sheet == null) {
				continue;
			}
			
			int firstRowNum = sheet.getFirstRowNum();
			Row firstRow = sheet.getRow(firstRowNum);
			
			if(null == firstRow) {
				LOGGER.info("Excel第一行无数据");
			}
			
			// 去掉前两行
			int rowStart = firstRowNum + 2;
			// 获取最后一行
			int rowEnd = sheet.getPhysicalNumberOfRows();
			
			// 获取日历接口数据
			DataModel monthDate = BaiduDateApiUtil.getCalendar(year, month);
			
			// 循环取数
			for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
				Row row = sheet.getRow(rowNum);
				
				if(null == row) {
					continue;
				}
				
				ExcelDataVo resultData = convertRowToData(row, monthDate);
				if(null == resultData) {
					LOGGER.warn("第 " + row.getRowNum() + "行数据不合法，已忽略!");
					continue;
				}
				resultList.add(resultData);
			}
		}
		return resultList;
	}
	
	/**
	  * 获取每行中每个单元格的内容 放入类中
	  * 一行为一个对象
	 * @param row
	 * @return
	 */
	private static ExcelDataVo convertRowToData(Row row, DataModel monthDate) {
		ExcelDataVo vo = new ExcelDataVo();
		// 放入二级部门
		vo.setSecondaryDep(Constant.SECONDARYDEP);
		// 放入值班类型
		vo.setWorkType(workType.值班.toString());
		
		// 获取最后一列
		int lastCellNum = row.getLastCellNum();
		// 获取值
		Cell cell;
		for (int i = 0; i < lastCellNum; i++) {
			cell = row.getCell(i);
			switch (i) {
			case 1:
				String date = cell.getStringCellValue();
				vo.setStartDate(date);
				
				// 要修改的地方
				int type = 0 ;
				// 在没有查到对应数据或者没网的时候，走程序中的日历，结果中日期类型不准确 需要在看一下，因为国家会串节假日
				if(null == monthDate) {
					type = LunarDate.workDayType(date);
				} else {
					// 获取接口中的数据进行判断，结果为对的
					type = BaiduDateApiUtil.workDayType(monthDate, date);
				}
				
				if(type > Constant.WORKDAY) {
					vo.setTotalTime(Constant.HOLIDAYSTOTALTIME);
				} else {
					vo.setTotalTime(Constant.WORKDAYTOTALTIME);
				}
				vo.setWorkDayType(Constant.workType(type));
				break;
			case 2:
				vo.setStartTime(cell.getStringCellValue());
				break;
			case 3:
				vo.setEndDate(cell.getStringCellValue());
				break;
			case 4:
				vo.setEntTime(cell.getStringCellValue());
				break;
			case 9:
				String workCause = cell.getStringCellValue();
				vo.setWorkCause(workCause);
				vo.setWorkType(workType(workCause));
				break;
			case 11:
				vo.setName(cell.getStringCellValue());
				break;
			case 12:
				vo.setNumber(cell.getStringCellValue());
				break;
			default:
				break;
			}
		}
		return vo;
	}
	
	/**
	 * 根据延时工作事由 判断 延时工作类型
	 * @param workCause
	 * @return
	 */
	private static String workType(String workCause) {
		String workType = "";
		if(workCause.indexOf(Constant.workType.值班.toString()) > 0) {
			workType = Constant.workType.值班.toString();
		} else if(workCause.indexOf("上线") > 0) {
			workType = Constant.workType.上线加班.toString();
		} else if(workCause.indexOf("加班") > 0) {
			workType = Constant.workType.普通加班.toString();
		}
		return workType;
	}
	
//	private static String convertCellValueToString(Cell cell) {
//		if(null == cell) {
//			return null;
//		}
//		String value = "";
//		switch (cell.getCellType()) {
//		case NUMERIC:
//			Double doubleValue = cell.getNumericCellValue();
//			DecimalFormat df = new DecimalFormat("0");
//			value = df.format(doubleValue);
//			break;
//		case STRING:
//			value = cell.getStringCellValue();
//		default:
//			break;
//		}
//		return value;
//	}
	
}
