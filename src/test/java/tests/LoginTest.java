package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void validLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
	}
	
}
