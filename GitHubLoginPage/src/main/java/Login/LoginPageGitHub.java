package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPageGitHub extends BaseClass {
	
	@FindBy(id="login_field")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-block js-sign-in-button']") 
	private WebElement signin;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forget_pass;
	
	@FindBy(xpath="//a[text()='Create an account']")
	private WebElement new_account;
	
	
	public LoginPageGitHub(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void credentials()
	{
		username.sendKeys("bhushanmandlik1211@gmail.com");
		password.sendKeys("bhushan");
	}

	public void click_signin()
	{
		signin.click();
	}
	
	public void forgetpassword()
	{
		forget_pass.click();
	}
	
	public void create_new_account()
	{
		new_account.click();
	}
	
	
}
