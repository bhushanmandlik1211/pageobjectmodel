package step_def_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebooktest {
	WebDriver driver;
	@Given("^launch chrome browser$")
		public void openBrowser()
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhushan\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		}

	@When("^enter facebook url$") 
	   public void goToFacebook()
		{ 
	      driver.navigate().to("https://www.facebook.com/"); 
	    }
	
	@And("^pass username and password$")
		public void credentials()
		{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhushanmandlik1211@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sonya@1211");
		}
	
	@Then("^click on login button$")
		public void button() 
		{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		}
}
