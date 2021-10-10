package maven_project_sample;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Scrollinng {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
	
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		
	

		
		//driver.close();
				
}
}