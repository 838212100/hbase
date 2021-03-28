package my.poi.excel.util;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import my.poi.excel.model.ExcelDataVo;
import my.poi.excel.util.Constant.TITLE;

/**
 * 
 * <p>Title: ExcelWriter</p>  
 * <p>Description: </p>  
 * @author runyang
 * @date 2021-3-26
 */
public class ExcelWriter {
	
	private ExcelWriter() {}
	
	/**
	 * 写入数据
	 * <p>Title: exportData</p>  
	 * <p>Description: </p>  
	 * @param list
	 * @param outFileTitleName
	 * @param month
	 * @return
	 */
	public static Workbook exportData(List<ExcelDataVo> list, String outFileTitleName, String month) {
		
		// 生成xlsx的Excel
        Workbook workbook = new HSSFWorkbook();
        
        Sheet sheet = buildDataSheet(workbook, outFileTitleName, month);
        // 构建单元格样式
		CellStyle voCellStyle = voCellStyle(sheet.getWorkbook());
        
        //构建每行的数据内容
        int rowNum = 2;
        for (ExcelDataVo data : list) {
            if (data == null) {
                continue;
            }
            //输出行数据
            Row row = sheet.createRow(rowNum++);
            row.setHeight((short) 410);
            convertDataToRow(data, row, voCellStyle);
        }
        return workbook;
	}
	
	/**
         * 生成sheet表，并写入第一行数据（列头）
     * @param workbook 工作簿对象
     * @return 已经写入列头的Sheet
     */
	public static Sheet buildDataSheet(Workbook workbook, String outFileTitleName, String month) {
		Sheet sheet = workbook.createSheet(month+"月");
		// 设置默认行高
//		sheet.setDefaultRowHeight((short) 300);
		
		// 构建单元格样式
		CellStyle cellStyle = buildHeadCellStyle(sheet.getWorkbook());
		
		// 设置列宽
		// POI中Sheet列宽是通过字符个数来确定的，列宽单位为一个字符宽度的1/256 
		// 每列可以显示的最大字符数为255 
		TITLE[] titleArray = Constant.TITLE.values();
		
		Row title = sheet.createRow(1);
		// 行高
		title.setHeight((short) (410 * 4));
		
		int defaultWidth = 20*256;
		
		for(int i = 0; i < titleArray.length; i++) {
			Cell cell = title.createCell(i);
            cell.setCellValue(titleArray[i].getDesc());
            cell.setCellStyle(cellStyle);
            sheet.setColumnWidth(i, defaultWidth);
            if(i == 2 || i == 4) {
            	sheet.setColumnWidth(i, 20*256);
            }
            if(i == 0 || i == 1 || i == 3 || i == 5 || i == 10) {
            	sheet.setColumnWidth(i, 12*256);
            }
		}
		
		// 设置第一行
		Row head = sheet.createRow(0);
		// 行高
		head.setHeight((short) 710);
		Cell cellHead = head.createCell(0);
		cellHead.setCellValue(outFileTitleName);
		cellHead.setCellStyle(headFont(workbook));
		// 合并单元格 从0开始
		CellRangeAddress cellRange1 = new CellRangeAddress(0, 0, (short) 0, (short) titleArray.length - 1);
		sheet.addMergedRegion(cellRange1);
		
        return sheet;
	}
	
	/**
	 * 头样式
	 * @param workbook
	 * @return
	 */
	private static CellStyle buildHeadCellStyle(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
        //左右对齐方式设置
        style.setAlignment(HorizontalAlignment.CENTER);
        //上下对齐方式设置
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //边框颜色和宽度设置
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 下边框
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex()); // 左边框
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex()); // 右边框
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex()); // 上边框
        // 自动换行
        style.setWrapText(true);
        //设置背景颜色
//        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
//        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //粗体字设置
        Font font = workbook.createFont();
        font.setFontName("宋体");
        font.setBold(true);
        style.setFont(font);
        return style;
	}
	
	private static CellStyle headFont(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
		//左右对齐方式设置
        style.setAlignment(HorizontalAlignment.CENTER);
        //上下对齐方式设置
        style.setVerticalAlignment(VerticalAlignment.CENTER);
		Font font = workbook.createFont();
        font.setFontName("宋体");
        font.setBold(true);
        font.setFontHeightInPoints((short) 16);
        style.setFont(font);
        return style;
	}
	
	/**
     * 将数据转换成行
     * @param data 源数据
     * @param row 行对象
     * @return
     */
    private static void convertDataToRow(ExcelDataVo data, Row row, CellStyle voCellStyle){
        int cellNum = 0;
        Cell cell;
        // 员工编号
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getNumber());
        cell.setCellStyle(voCellStyle);
        // 姓名
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getName());
        cell.setCellStyle(voCellStyle);
        // 二级部门
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getSecondaryDep());
        cell.setCellStyle(voCellStyle);
        // 延时工作类型
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkType());
        cell.setCellStyle(voCellStyle);
        // 延时工作事由
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkCause());
        cell.setCellStyle(voCellStyle);
        // 假期类型
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkDayType());
        cell.setCellStyle(voCellStyle);
        // 延时工作开始日期
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getStartDate());
        cell.setCellStyle(voCellStyle);
        // 延时工作开始时间
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getStartTime());
        cell.setCellStyle(voCellStyle);
        // 延时工作结束日期
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getEndDate());
        cell.setCellStyle(voCellStyle);
        // 延时工作结束时间
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getEntTime());
        cell.setCellStyle(voCellStyle);
        // 核算小时数
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getTotalTime());
        cell.setCellStyle(voCellStyle);
        int rowNum = row.getRowNum()+1;
        cell.setCellFormula("IF(F"+rowNum+"=\"工作日\",4,IF(F"+rowNum+"=\"休息日\",6,IF(F"+rowNum+"=\"节假日\",6,0)))");
    }
    
    /**
     *	 正文样式
     * @param workbook
     * @return
     */
    private static CellStyle voCellStyle(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
        //左右对齐方式设置
        style.setAlignment(HorizontalAlignment.CENTER);
        //上下对齐方式设置
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //边框颜色和宽度设置
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 下边框
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex()); // 左边框
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex()); // 右边框
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex()); // 上边框
        return style;
	}
    
//    public static void main(String[] args) {
//    	TITLE[] titleArray = Constant.TITLE.values();
//    	for (int i = 0; i < titleArray.length; i++) {
//			System.out.println(titleArray[i].getDesc());
//		}
//	}
}
