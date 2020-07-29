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

public class ExcelWriter {
	
	private ExcelWriter() {}
	
	public static Workbook exportData(List<ExcelDataVo> list, String outFileTitleName) {
		
		// ����xlsx��Excel
        Workbook workbook = new HSSFWorkbook();
        
        Sheet sheet = buildDataSheet(workbook, outFileTitleName);
        // ������Ԫ����ʽ
		CellStyle voCellStyle = voCellStyle(sheet.getWorkbook());
        
        //����ÿ�е���������
        int rowNum = 2;
        for (ExcelDataVo data : list) {
            if (data == null) {
                continue;
            }
            //���������
            Row row = sheet.createRow(rowNum++);
            row.setHeight((short) 410);
            convertDataToRow(data, row, voCellStyle);
        }
        return workbook;
	}
	
	/**
         * ����sheet����д���һ�����ݣ���ͷ��
     * @param workbook ����������
     * @return �Ѿ�д����ͷ��Sheet
     */
	public static Sheet buildDataSheet(Workbook workbook, String outFileTitleName) {
		Sheet sheet = workbook.createSheet();
		// ����Ĭ���и�
//		sheet.setDefaultRowHeight((short) 300);
		
		// ������Ԫ����ʽ
		CellStyle cellStyle = buildHeadCellStyle(sheet.getWorkbook());
		
		// �����п�
		// POI��Sheet�п���ͨ���ַ�������ȷ���ģ��п�λΪһ���ַ���ȵ�1/256 
		// ÿ�п�����ʾ������ַ���Ϊ255 
		TITLE[] titleArray = Constant.TITLE.values();
		
		Row title = sheet.createRow(1);
		// �и�
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
		
		// ���õ�һ��
		Row head = sheet.createRow(0);
		// �и�
		head.setHeight((short) 710);
		Cell cellHead = head.createCell(0);
		cellHead.setCellValue(outFileTitleName);
		cellHead.setCellStyle(headFont(workbook));
		// �ϲ���Ԫ�� ��0��ʼ
		CellRangeAddress cellRange1 = new CellRangeAddress(0, 0, (short) 0, (short) titleArray.length - 1);
		sheet.addMergedRegion(cellRange1);
		
        return sheet;
	}
	
	/**
	 * ͷ��ʽ
	 * @param workbook
	 * @return
	 */
	private static CellStyle buildHeadCellStyle(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
        //���Ҷ��뷽ʽ����
        style.setAlignment(HorizontalAlignment.CENTER);
        //���¶��뷽ʽ����
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //�߿���ɫ�Ϳ������
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // �±߿�
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex()); // ��߿�
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex()); // �ұ߿�
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex()); // �ϱ߿�
        // �Զ�����
        style.setWrapText(true);
        //���ñ�����ɫ
//        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
//        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        //����������
        Font font = workbook.createFont();
        font.setFontName("����");
        font.setBold(true);
        style.setFont(font);
        return style;
	}
	
	private static CellStyle headFont(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
		//���Ҷ��뷽ʽ����
        style.setAlignment(HorizontalAlignment.CENTER);
        //���¶��뷽ʽ����
        style.setVerticalAlignment(VerticalAlignment.CENTER);
		Font font = workbook.createFont();
        font.setFontName("����");
        font.setBold(true);
        font.setFontHeightInPoints((short) 16);
        style.setFont(font);
        return style;
	}
	
	/**
     * ������ת������
     * @param data Դ����
     * @param row �ж���
     * @return
     */
    private static void convertDataToRow(ExcelDataVo data, Row row, CellStyle voCellStyle){
        int cellNum = 0;
        Cell cell;
        // Ա�����
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getNumber());
        cell.setCellStyle(voCellStyle);
        // ����
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getName());
        cell.setCellStyle(voCellStyle);
        // ��������
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getSecondaryDep());
        cell.setCellStyle(voCellStyle);
        // ��ʱ��������
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkType());
        cell.setCellStyle(voCellStyle);
        // ��ʱ��������
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkCause());
        cell.setCellStyle(voCellStyle);
        // ��������
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getWorkDayType());
        cell.setCellStyle(voCellStyle);
        // ��ʱ������ʼ����
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getStartDate());
        cell.setCellStyle(voCellStyle);
        // ��ʱ������ʼʱ��
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getStartTime());
        cell.setCellStyle(voCellStyle);
        // ��ʱ������������
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getEndDate());
        cell.setCellStyle(voCellStyle);
        // ��ʱ��������ʱ��
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getEntTime());
        cell.setCellStyle(voCellStyle);
        // ����Сʱ��
        cell = row.createCell(cellNum++);
        cell.setCellValue(data.getTotalTime());
        cell.setCellStyle(voCellStyle);
        int rowNum = row.getRowNum()+1;
        cell.setCellFormula("IF(F"+rowNum+"=\"������\",4,IF(F"+rowNum+"=\"��Ϣ��\",6,IF(F"+rowNum+"=\"�ڼ���\",6,0)))");
    }
    
    /**
     *	 ������ʽ
     * @param workbook
     * @return
     */
    private static CellStyle voCellStyle(Workbook workbook) {
		CellStyle style = workbook.createCellStyle();
        //���Ҷ��뷽ʽ����
        style.setAlignment(HorizontalAlignment.CENTER);
        //���¶��뷽ʽ����
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //�߿���ɫ�Ϳ������
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // �±߿�
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex()); // ��߿�
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex()); // �ұ߿�
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex()); // �ϱ߿�
        return style;
	}
    
//    public static void main(String[] args) {
//    	TITLE[] titleArray = Constant.TITLE.values();
//    	for (int i = 0; i < titleArray.length; i++) {
//			System.out.println(titleArray[i].getDesc());
//		}
//	}
}
