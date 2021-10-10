package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://www.firstcry.com/store-locator?ref2=topstrip");
		 driver.manage().window().maximize(); 
		
		//to handle dropdown we use select class 1st way-->
		 
		 WebElement state =driver.findElement(By.xpath("//select[@name='state']"));
		Select select=new Select(state);
		select.selectByIndex(7);
		
		//2nd way
		Select select1=new Select(driver.findElement(By.xpath("//select[@name='city']")));
		 select1.selectByIndex(3);
	
		
		
	}

}
