package selenium;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FirstcryTesting {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
		
		//**************by using action class mouse over action takesplace*******************
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Stores & Preschools']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Find Stores']")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Stores & Preschools']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Find Preschools']")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Stores & Preschools']"))).build().perform();
		//driver.findElement(By.xpath("//a[@class='Stores-play R14_42 ']")).click();
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Stores & Preschools']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Open a Preschool']")).click();
		
		//****************page load wait************************
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		
		//****************for single window handle ******************************
		
		String pid=driver.getWindowHandle();
		System.out.println(pid);
	
		//******************for handle multiple window***************************
		
		 Set<String> handler=driver.getWindowHandles();
		 int count=handler.size();
		 System.out.println(count);
		
		//**************select class for handle dropdown****************
		/* driver.get("https://www.firstcry.com/store-locator?ref2=topstrip");
		 driver.manage().window().maximize();
		 Select select=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		 select.selectByIndex(7);
		 Select select1=new Select(driver.findElement(By.xpath("//select[@name='city']")));
		 select1.selectByIndex(3);*/
		 
		 
	
	
	}
	
	

}
