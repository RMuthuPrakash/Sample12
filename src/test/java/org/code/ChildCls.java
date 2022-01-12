package org.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChildCls {
	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\Users\\Muthu Prakash\\eclipse-workspace\\SampleProject\\Excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(file);

		Sheet s = w.getSheet("class1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		Row r = s.getRow(1);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);

		Cell c = r.getCell(1);
		System.out.println(c);

	}
}
