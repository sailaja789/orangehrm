package com.ExcelOperrions;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel_Write_operations 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("./src/com/SingleTestDate/SampleFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.createRow(2);
		Cell cell=row.createCell(3);
		cell.setCellValue("selenium");
		FileOutputStream file1=new FileOutputStream("./src/com/SingleTestDate/SampleFile.xlsx");
		workbook.write(file1);
	}

}