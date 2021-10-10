package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushanmandlik1211@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sonya@1211");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
