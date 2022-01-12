package org.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseCls {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Muthu Prakash\\eclipse-workspace\\SampleProject\\Excel\\new.xlsx");

		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);

		String value = cell.getStringCellValue();
		if (value.equals("amma")) {
			Cell createCell = row.createCell(1);
			createCell.setCellValue("Appa");
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

}
