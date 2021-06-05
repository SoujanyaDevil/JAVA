package com.mavn.MAVEN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
//dsfgsdfgdfgdsgdf
public class MAV {
	static WebDriver driver = null;
	public static void main (String args[]) throws Exception 
	{
		XSSFWorkbook WBook=null;
		XSSFSheet WSheet = null;
		XSSFRow WRow  = null;
		int rowCount;
		int columnCount;
		//dfgdsfsdfdsf
		FileInputStream ExcelFile=new FileInputStream("C:\\Users\\dell\\Desktop\\FIS.xlsx");
		WBook= new XSSFWorkbook(ExcelFile);
		
		WSheet = WBook.getSheet("Sj");
		rowCount = WSheet.getLastRowNum();
		System.out.println("RowCount>>>"+rowCount);
		
		WRow = WSheet.getRow(0);
		columnCount  = WRow.getLastCellNum();
		System.out.println("ColumnCount>>>"+columnCount);
		
		
		String data[][]=new String[rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<columnCount;j++)
			{
				data[i-1][j-1]=WSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i-1][j-1]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
	}
	
	
	}
