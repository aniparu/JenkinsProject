package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;// global level

	public static WebDriver browserLaunch() {// local variable

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		return driver;

	}
	
	
	public static WebDriver firefoxbrowserLaunch() {// local variable

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		return driver;

	}

	public static void loadUrl(String url) {

		driver.get(url);
	}

	public static void browserMaximize() {
		driver.manage().window().maximize();

	}

	public static String pageTitle() {
		String Tittle = driver.getTitle();
		return Tittle;
		
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}
	
	public static void closeTheBrowser() {
		driver.quit();

	}

	public static void performDragandDrap(WebElement from, WebElement to) {
		Actions a = new Actions(driver);

		a.dragAndDrop(from, to).perform();

	}

	public static String excelRead(String sheetName, int rowNum, int cellNum) throws InterruptedException, IOException {

		// 1.mention excel file path

		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenBatch5.30Pm\\ExcelSheet\\5pm batch.xlsx");

		// 2.Read a file
		FileInputStream fi = new FileInputStream(f);

		Thread.sleep(1000);

		// 3.Read the exact file file format
		Workbook wb = new XSSFWorkbook(fi);

		// Work book------------sheet ----------row------------cell--- datas

		// 4.get the sheet from work book
		Sheet Mysheet = wb.getSheet(sheetName);

		Row r = Mysheet.getRow(rowNum);// 0,1,2,3,5,5

		Cell c = r.getCell(cellNum);

		// Each cell type
		int cellType = c.getCellType();

		// by default whether cell type==1---->String
		// cellType otherthan 1--->Numeric cell or Date cell

		String value = "";
		if (cellType == 1) {
			value = c.getStringCellValue();
			System.out.println(value);

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date DD = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
			value = sdf.format(DD);
			System.out.println(value);

		}

		else {

			double d = c.getNumericCellValue();// 9.876543111E9
			long l = (long) d;

			value = String.valueOf(l);
			System.out.println(value);

		}

		return value;

	}
	
	//create new file

	public static void createExcelFile(int rowNum,int cellNum) throws IOException {
		// to write the data into excel file

		// 1.mention the path location
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenBatch5.30Pm\\ExcelSheet\\Newfile.xlsx");

		// create a workbook
		Workbook w = new XSSFWorkbook();

		// create sheet in workbook
		Sheet newSheet = w.createSheet("Batch");

		// create a row in sheet
		Row newRow = newSheet.createRow(rowNum);

		// create a cell in row
		Cell newCell = newRow.createCell(cellNum);

		// set the value in 0 th row and 0th cell
		newCell.setCellValue("data driven");

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed.....");

	}
	
	
	//to create new cell only
	public static void CreateCellOnly(String sheetName,int getTheRow,int crecell,String newData) throws IOException {
		
		// to write the data into excel file

				// 1.mention the path location
				File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenBatch5.30Pm\\ExcelSheet\\Newfile.xlsx");
				
				//To read a file
				FileInputStream fis = new FileInputStream(f);
				// create a workbook
				Workbook w = new XSSFWorkbook(fis);

				// create sheet in workbook
				Sheet newSheet = w.getSheet(sheetName);

				// create a row in sheet
				Row newRow = newSheet.getRow(getTheRow);

				// create a cell in row
				Cell newCell = newRow.createCell(crecell);

				// set the value in 0 th row and 0th cell
				newCell.setCellValue(newData);

				FileOutputStream fos = new FileOutputStream(f);

				w.write(fos);

				System.out.println("Writed.....");

		

	}
	
	//create Row only
	public static void createRowOnly(String sheetName, int creRow, int crecell, String newData) throws IOException {
		// 1.mention the path location
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenBatch5.30Pm\\ExcelSheet\\Newfile.xlsx");
		
		//To read a file
		FileInputStream fis = new FileInputStream(f);
		// create a workbook
		Workbook w = new XSSFWorkbook(fis);

		// create sheet in workbook
		Sheet newSheet = w.getSheet(sheetName);

		// create a row in sheet
		Row newRow = newSheet.createRow(creRow);

		// create a cell in row
		Cell newCell = newRow.createCell(crecell);

		// set the value in 0 th row and 0th cell
		newCell.setCellValue(newData);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed.....");


	}
	
	//to replace the cell
	public static void updateCell(String sheetName,int getTheRow,int getTheCell,String exisitingData,String replaceData) throws IOException {
		// 1.mention the path location
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenBatch5.30Pm\\ExcelSheet\\Newfile.xlsx");
		
		//To read a file
		FileInputStream fis = new FileInputStream(f);
		// create a workbook
		Workbook w = new XSSFWorkbook(fis);

		// create sheet in workbook
		Sheet newSheet = w.getSheet(sheetName);

		// create a row in sheet
		Row newRow = newSheet.getRow(getTheRow);

		// create a cell in row
		Cell newCell = newRow.getCell(getTheCell);
		
		String value = newCell.getStringCellValue();
		
		if (value.equals(exisitingData)) {
			newCell.setCellValue(replaceData);
			
		}

		
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Writed.....");


		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
