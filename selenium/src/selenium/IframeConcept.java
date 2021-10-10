package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConcept {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver",  "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
	//***********************handle iframe*****************************
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame("globalSqa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("bhushan");
	
		
		
		
		
	}

}
