package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com");
driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("bhushanmandlik1211@gmail.com");
driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhushan@1373");
driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	}

}
