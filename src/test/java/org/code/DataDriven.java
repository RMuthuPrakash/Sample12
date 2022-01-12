package org.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Muthu Prakash\\eclipse-workspace\\SampleProject\\Excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);

		Sheet sh = w.getSheet("class1");
		int physicalNumberOfRows = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row r = sh.getRow(i);

			int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell c = r.getCell(j);

				int cellType = c.getCellType();
				String value;
				if (cellType == 1) {
					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date dateCell = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

					value = s.format(dateCell);
				} else {
					double numericCell = c.getNumericCellValue();
					long l = (long) numericCell;
					value = String.valueOf(l);

				}
				System.out.println(value);

			}

		}

	}

}
