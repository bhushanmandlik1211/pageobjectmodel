package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Demo11 {
	WebDriver driver;
	@Test(priority=0)
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}

	@Test(priority=1)
	   public void goToFacebook()
		{ 
	      driver.get("https://www.facebook.com"); 
	    }
	
	@Test(priority=2)
		public void credentials()
		{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushanmandlik1211@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sonya@1211");
		}
	
	@Test(priority=3)
		public void button() 
		{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}




}
