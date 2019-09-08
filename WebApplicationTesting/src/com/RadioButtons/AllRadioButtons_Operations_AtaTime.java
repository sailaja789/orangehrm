package com.RadioButtons;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllRadioButtons_Operations_AtaTime 
{
 public static void main(String[] args)
 {
           WebDriver driver = null;
           String url = "http:/www.echoecho.com/htmlforms10.htm";
		   System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(url);
		   WebElement radio_button_block = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		   List<WebElement> all_radio_buttons = radio_button_block.findElements(By.xpath("//td[@class='table5']/input[@type='radio']"));
				
				for(int i=0;i<all_radio_buttons.size();i++)
				{
						all_radio_buttons.get(i).click();
						System.out.println(all_radio_buttons.get(i).getAttribute("value") +" is selected ");
						System.out.println();
							for(int j=0;j<all_radio_buttons.size();j++)
							{
									System.out.println(all_radio_buttons.get(j).isSelected()+" - "+all_radio_buttons.get(j).getAttribute("value"));
							}
							System.out.println();
				}
				driver.quit();
			}
		}

