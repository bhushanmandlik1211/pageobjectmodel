package maven_project_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClass {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
		
		WebElement element=driver.findElement(By.xpath("(//a[@href='/live'])[3]"));
		
		Actions ac=new Actions(driver);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 300)");
	
		ac.moveToElement(element).build().perform();
 
	}

	

}
