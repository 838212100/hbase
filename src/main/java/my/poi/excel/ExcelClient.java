package my.poi.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.poi.excel.model.ExcelDataVo;
import my.poi.excel.util.ExcelReader;
import my.poi.excel.util.ExcelWriter;

/**
  * 入口
 * @author yang
 *
 */
public class ExcelClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExcelClient.class);
	
	// 年
	private static final String YEAR = "2020";
	// 月
	private static final String MONTH = "8";
	
	// 读入的文件名 后缀是xls 、xlsx均可
	private static final String INFILENAME = "C:\\Users\\yang\\Desktop\\值班列表2020-08-01-2020-08-31.xls";
	
	// 输出的文件名
	private static final String OUTFILENAME = "C:\\Users\\yang\\Desktop\\2020年延时工作记录表.xls";
	
	
	public static void main(String[] args) throws ParseException {
		// 输出文件第一行标题 名称
		String outFileTitleName = "2020 年 "+MONTH+" 月重点保障延时工作记录表";
		
		List<ExcelDataVo> list = ExcelReader.readExcel(INFILENAME, YEAR, MONTH);
		
		// 写入数据到工作簿对象内
		Workbook workbook = ExcelWriter.exportData(list, outFileTitleName, MONTH);
		workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
		
		// 以文件的形式输出工作簿对象
		FileOutputStream fileOut = null;
		
		try {
			File exportFile = new File(OUTFILENAME);
			if(!exportFile.exists()) {
				exportFile.createNewFile();
			}
			
			fileOut = new FileOutputStream(exportFile);
			workbook.write(fileOut);
			fileOut.flush();
		} catch (IOException e) {
			LOGGER.error("输出Excel出错，原因：" + e.getMessage());
		} finally {
			try {
				if(null != workbook) {
					workbook.close();
				}
				if(null != fileOut) {
					fileOut.close();
				}
			} catch (IOException e) {
				LOGGER.error("关闭流时出错，原因：" + e.getMessage());
			}
		}
	}

}