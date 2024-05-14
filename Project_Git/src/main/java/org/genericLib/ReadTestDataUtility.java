package org.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Tanmay
 *
 */
public class ReadTestDataUtility implements ShoppersStackConstants {

	File absPath = new File(EXCEL_PATH);
	Workbook wb;
	Sheet sheet;

	/***
	 * This method is use to read the data from the excel sheet from the particular
	 * cell/column in String format
	 * 
	 * @param sheetName the sheetName which u want to read data
	 * @param rowNum    specify from which row u want data
	 * @param colNum    specify from which col/cell u want data
	 * @return
	 */

	public String readStringDataFromExcel(String sheetName, int rowNum, int colNum) {
		try {
			FileInputStream fis = new FileInputStream(absPath);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}

	/***
	 * This method is use to read the data from the excel sheet from the particular
	 * cell/column in Numeric format
	 * 
	 * @param sheetName the sheetName which u want to read data
	 * @param rowNum    specify from which row u want data
	 * @param colNum    specify from which col/cell u want data
	 * @return
	 */
	public double readNumericDataFromExcel(String sheetName, int rowNum, int colNum) {
		try {
			FileInputStream fis = new FileInputStream(absPath);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

	}

	/***
	 * This method is use to read the last row from sheet where data is store .
	 * 
	 * @param sheetName the sheetName which u want to read data
	 * @return
	 */

	public int getLastRowNum(String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(absPath);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetName);
		return sheet.getLastRowNum();

	}

	/***
	 * This method is use read data from all the row and col in String Format
	 * 
	 * @param sheetName the sheetName which u want to read data
	 * @return
	 */
	public String[][] readAllDatainStringFromExcel(String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(absPath);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetName);

		int physcialRowNum = sheet.getPhysicalNumberOfRows();
		int physicalColNum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] strArry = new String[physcialRowNum][physicalColNum];

		for (int i = 0; i < physcialRowNum; i++) {

			for (int j = 0; j < physicalColNum; j++) {
				strArry[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return strArry;
	}

	/***
	 * this method used to reading data from property file
	 * 
	 * @param key specify from property file
	 * @return
	 */
	public String getDataFromProperty(String key) {
		Properties p = null;
		try {
			FileInputStream fis = new FileInputStream(PROPERTY_PATH);
			p = new Properties();
			p.load(fis);
			p.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return p.getProperty(key);
	}

}
