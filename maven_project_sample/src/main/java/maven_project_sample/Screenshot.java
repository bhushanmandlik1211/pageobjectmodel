package maven_project_sample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		Date d=new Date();
		String date=d.toString();
		System.out.println(date);
		
		String new_date=date.replaceAll(":", "_");
		System.out.println(new_date);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+new_date+"_image.png");
		FileUtils.copyFile(src, dest);
	}

}
