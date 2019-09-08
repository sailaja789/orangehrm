package com.webtablerowofcolumntimeanddate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete_Data 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String data=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				System.out.println(data+" ");
			}
			System.out.println();
		}
		driver.quit();
	}

}
