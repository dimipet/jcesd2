package com.dimipet.jcesd2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelController {

	private Workbook wb;
	private CreationHelper createHelper;
	private Sheet sheet;
	private Row row;
	private InputStream fileIn;
	private FileOutputStream fileOut;

	public ExcelController() {
		try {
			// TODO add app.properties
			this.fileIn = new FileInputStream("results.xlsx");
			this.wb = new XSSFWorkbook(fileIn);
			// TODO add app.properties
			this.sheet = wb.getSheet("survey-data");
			this.createHelper = wb.getCreationHelper();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int getLastRowNum() {
		int ret = 1;
		for (int rowNum = sheet.getLastRowNum(); rowNum >= 0; rowNum--) {
		    final Row row = sheet.getRow(rowNum);
		    if (row != null && row.getCell(0) != null) {
		        ret = rowNum;
		        break;
		    }
		}
		return ret;
	}

	public void createNewRow() {

		this.row = sheet.createRow(this.getLastRowNum() + 1);
	}

	public void createAndWriteToCell(int i) {
		if (this.row.getLastCellNum() <= 0) {
			this.row.createCell(this.row.getLastCellNum() + 1).setCellValue(i);
		} else {
			this.row.createCell(this.row.getLastCellNum()).setCellValue(i);
		}
	}

	public void createAndWriteToCell(String s) {
		if (this.row.getLastCellNum() <= 0) {
			this.row.createCell(this.row.getLastCellNum() + 1).setCellValue(createHelper.createRichTextString(s));
		} else {
			this.row.createCell(this.row.getLastCellNum()).setCellValue(createHelper.createRichTextString(s));
		}
	}

	public void createAndWriteToCell(double d) {
		this.row.createCell(this.row.getLastCellNum() + 1).setCellValue(d);
	}

	public void createAndWriteToCell(boolean b) {
		this.row.createCell(this.row.getLastCellNum() + 1).setCellValue(b);
	}

	public void writeToFile() {
		try {
			// TODO add app.properties
			fileOut = new FileOutputStream("results.xlsx");
			wb.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
