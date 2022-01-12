
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

public class For {
	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\Users\\Muthu Prakash\\eclipse-workspace\\SampleProject\\Excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheet("class1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < 4; i++) {

			Row r = s.getRow(i);
			int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < 5; j++) {

				Cell c = r.getCell(j);
				System.out.println(c);

			}

		}
	}

}
