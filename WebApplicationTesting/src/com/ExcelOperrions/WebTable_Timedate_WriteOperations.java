package com.ExcelOperrions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Timedate_WriteOperations 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section"));
		
		FileInputStream file=new FileInputStream("./src/com/SingleTestDate/WebtableTimedateExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		List<WebElement>rows1=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows1.size();i++)
		{
		  Row row=sheet.createRow(i);
		  List<WebElement>cols=rows1.get(i).findElements(By.tagName("td"));		
		 for(int j=0;j<cols.size();j++)
		 {
		    String data=cols.get(j).getText();
		    System.out.print(data+"   ");
		    Cell cell=row.createCell(j);
		    cell.setCellValue(data);
		    FileOutputStream file1=new FileOutputStream("./src/com/SingleTestDate/WebtableTimedateExcel.xlsx");
		    workbook.write(file1);
		 }
		    System.out.println();
	}
		driver.close();

   }
}	
