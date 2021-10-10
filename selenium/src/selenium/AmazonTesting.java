package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//Actions action=new Actions(driver);
		
	    driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		driver.findElement(By.xpath("//a[text()='Amazon Launchpad']")).click();
		driver.findElement(By.xpath("//a[text()='Body']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
	}


}
