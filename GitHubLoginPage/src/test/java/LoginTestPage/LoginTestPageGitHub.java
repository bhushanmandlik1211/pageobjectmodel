package LoginTestPage;

import org.testng.annotations.Test;

import Base.BaseClass;
import Login.LoginPageGitHub;

public class LoginTestPageGitHub extends BaseClass  {
	
	@Test(priority=3)
	 public void login()
	 {
		LoginPageGitHub login=new LoginPageGitHub(driver);
		login.credentials();
		login.click_signin();
	 }
	
	@Test(priority=1)
	public void create_account()
	{
		LoginPageGitHub login=new LoginPageGitHub(driver);
		login.create_new_account();
		login.back();
	}
	
	@Test(priority=2)
	public void reset_password()
	{
		LoginPageGitHub login=new LoginPageGitHub(driver);
		login.forgetpassword();
		login.back();
	}
}
