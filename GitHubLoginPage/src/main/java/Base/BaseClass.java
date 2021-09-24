package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream file;
	
	String path="D:\\Bhushan\\pageobjectmodel1\\GitHubLoginPage\\src\\main\\resources\\data.properties";
	
	public BaseClass() 
	{
		prop=new Properties();
		
		try {
			file=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void screenShot(WebDriver driver) throws IOException,InterruptedException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Bhushan\\pageobjectmodel1\\GitHubLoginPage\\target\\screenshot");
		FileUtils.copyFile(src, dest);
	}
	
	@BeforeSuite
	
	public void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterSuite
	
	public void Close() 
	{
		driver.close();
	}
	
	public void back()
	{
		driver.navigate().back();
	}
}
