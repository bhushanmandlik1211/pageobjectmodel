package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		List<WebElement> lissst=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(lissst.size());
		List<WebElement> list1=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(list1.size());
		
		
		//***************for columns**************************
		
		List<WebElement> listt=driver.findElements(By.xpath("//table/thead/tr/th"));
		//System.out.println(list1.size());
		for(int i=0;i<=listt.size()-1;i++)
		{
			String text=listt.get(i).getText();
			System.out.print(text+"   ");
			
		}
		System.out.println("");
		
		//****************for rows**********************
				List<WebElement> list=driver.findElements(By.xpath("//table/tbody/tr"));
			//	System.out.println(list.size());
				for(int i=0;i<=list.size()-1;i++)
				{
					String text1=list.get(i).getText();
					System.out.println(text1+"      ");
				}
				
	}

}
