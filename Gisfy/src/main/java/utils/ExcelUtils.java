package utils;

import static components.AppCommon.cell;
import static components.AppCommon.dataDrivenMap;
import static components.AppCommon.fileInputStream;
import static components.AppCommon.row;
import static components.AppCommon.sheet;
import static components.AppCommon.workbook;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void loadExcel(String xlsxFile, String xlsxSheet) throws Exception {
		fileInputStream = new FileInputStream(xlsxFile);
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheet(xlsxSheet);
	}

	public static int getRowCount(String xlsxFile, String xlsxSheet) throws Exception {
		loadExcel(xlsxFile, xlsxSheet);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		fileInputStream.close();
		return rowCount;
	}

	public static int getCellCount(String xlsxFile, String xlsxSheet, int rowNumber) throws Exception {
		loadExcel(xlsxFile, xlsxSheet);
		int cellCount = sheet.getRow(rowNumber).getLastCellNum();
		workbook.close();
		fileInputStream.close();
		return cellCount;
	}

	public static String getCellData(String xlsxFile, String xlsxSheet, int rowNumber, int colNumber)throws Exception {
		loadExcel(xlsxFile, xlsxSheet);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(colNumber);
		String data;
		try {
//			data=cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		workbook.close();
		fileInputStream.close();
		return data;
	}
	
	public static int getRowNumber(String filePath,String sheetName,String methodName) throws Exception {
		int rowNum = 0;
		int rows = ExcelUtils.getRowCount(filePath, sheetName);
		for (int row = 0; row <= rows; row++) {
			if (methodName.equals(ExcelUtils.getCellData(filePath, sheetName, row, 0))) {
				rowNum = row;
				break;
			}
		}
		return rowNum;
	}
	
	public static void loadTestData(String fileName,String testName) throws Exception {
		loadExcel(fileName, testName);
		String filePath=PropertiesUtils.getKeyValue("filePath");
		String sheetName=PropertiesUtils.getKeyValue("sheetName");
		int rowNum = getRowNumber(filePath, sheetName, testName);
		dataDrivenMap = new HashMap<String, String>();
		int cells = ExcelUtils.getCellCount(filePath, sheetName, 0);
		for (int cell = 1; cell < cells; cell++) {
			String key = ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value = ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			dataDrivenMap.put(key, value);
		}
		System.out.println(dataDrivenMap);
	}
}
