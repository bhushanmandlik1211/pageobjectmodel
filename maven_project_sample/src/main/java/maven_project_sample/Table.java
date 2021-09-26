package maven_project_sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
 
	public static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\Bhushan\\NOTES\\table.html");
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		int count=rows.size();
		System.out.println(count);
		
		List<WebElement> cols=driver.findElements(By.xpath("//th"));
		int count1=cols.size();
		System.out.println(count1);
		
		List<WebElement>allcells=driver.findElements(By.xpath("//td|//th"));
		int count2=allcells.size();
		System.out.println(count2);
		
		for(WebElement web:allcells)
		{
			String abc=web.getText();
			System.out.println(abc);
		}

	}

}
