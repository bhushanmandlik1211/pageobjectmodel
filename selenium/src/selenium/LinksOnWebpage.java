package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnWebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++)
		{
			String text=list.get(i).getAttribute("href");
			System.out.println(text);
		}

	}

}
