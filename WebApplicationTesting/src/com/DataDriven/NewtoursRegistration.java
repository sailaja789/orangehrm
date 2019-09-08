package com.DataDriven;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
	public class NewtoursRegistration extends BaseTest1
	{
	@Test
	public void newuserregistration() throws IOException
	{
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/NewtoursRegistration.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			driver.findElement(By.name("firstName")).clear();
			WebElement firstName=driver.findElement(By.name("firstName"));
			firstName.sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).clear();
			WebElement lastName=driver.findElement(By.name("lastName"));
			lastName.sendKeys(row.getCell(1).getStringCellValue());
			double d=row.getCell(2).getNumericCellValue();
			long x=(long)d;
			String PhnoneNumber=Long.toString(x);
			driver.findElement(By.name("phone")).clear();
			WebElement Phone=driver.findElement(By.name("phone"));
			Phone.sendKeys(PhnoneNumber);
			driver.findElement(By.name("userName")).clear();
			WebElement email=driver.findElement(By.name("userName"));
			email.sendKeys(row.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).clear();
			WebElement address=driver.findElement(By.name("address1"));
			address.sendKeys(row.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).clear();
			WebElement city=driver.findElement(By.name("city"));
			city.sendKeys(row.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).clear();
			WebElement state=driver.findElement(By.name("state"));
			state.sendKeys(row.getCell(6).getStringCellValue());
			//postalCode
			double l=row.getCell(7).getNumericCellValue();
			long y=(long)d;
			String PostalCodeNum=Long.toString(y);
			driver.findElement(By.name("postalCode")).clear();
			WebElement postalcode=driver.findElement(By.name("postalCode"));
			postalcode.sendKeys(PostalCodeNum);
			WebElement country=driver.findElement(By.name("country"));
			country.sendKeys(row.getCell(8).getStringCellValue());
			driver.findElement(By.name("email")).clear();
			WebElement userName=driver.findElement(By.name("email"));
			userName.sendKeys(row.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).clear();
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys(row.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).clear();
			WebElement confirmpassword=driver.findElement(By.name("confirmPassword"));
			confirmpassword.sendKeys(row.getCell(11).getStringCellValue());
			WebElement submit=driver.findElement(By.name("register"));
			submit.click();
			String Expected_userName=row.getCell(9).getStringCellValue();
			System.out.println("the Expected userName is "+Expected_userName);
			String Actual_RegistereduserNameText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")).getText();
			System.out.println("the Actual RegistereduserName is "+ Actual_RegistereduserNameText);
			if(Actual_RegistereduserNameText.contains(Expected_userName))
			{
				System.out.println("registration successfull - PASS");
				row.createCell(12).setCellValue("registration successfull - PASS");
				driver.navigate().back();
			}
			else
			{
				System.out.println("registration - FAIL");
				row.createCell(12).setCellValue("registration Failed - FAIL");
			}
		}
			FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResult/NewtoursUserRegistration-TestResult1.xlsx");
		      workbook.write(file1);   
	 }
	     }
	  
