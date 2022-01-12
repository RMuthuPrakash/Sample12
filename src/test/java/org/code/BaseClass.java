package org.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());
	}

	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void fill(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	public static void fil(WebElement e, String Value) {
		e.sendKeys(Value);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static String excelRead(String SheetNo, int rowNo, int cellNo) throws IOException {

		File f = new File(
				"C:\\Users\\Muthu Prakash\\eclipse-workspace\\SampleProject\\Excel\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);

		Sheet sh = w.getSheet(SheetNo);

		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);

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
		return value;

	}

}
