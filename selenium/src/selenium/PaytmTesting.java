package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Paytm For Business']"))).build().perform();
		//driver.findElement(By.xpath("")).click();
	}

}
