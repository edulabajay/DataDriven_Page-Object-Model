package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.BasePage.BasePageTest;

public class UtilityPage extends BasePageTest {
	
	public static long PAGE_LOAD_TIMEOUT = 70;
	public static long IMPLICIT_WAIT = 70;

	
//////-----Test Data Excel File Path----///////
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\info\\eclipse-workspace\\POM3\\src\\test\\resources\\TestData\\FreeCRMTestData.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	/////-----ScreenShot ------//////
	public static void takeScreenshotAtEndOfTest() throws IOException {
	    TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
	    File srcFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
	    String timestamp = String.valueOf(System.currentTimeMillis());
	    String screenshotPath = "screenshots/" + timestamp + ".png";

	    FileUtils.copyFile(srcFile, new File(screenshotPath));
	}
}
