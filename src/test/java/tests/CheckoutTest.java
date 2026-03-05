package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest{
	@Test 
	public void completeCheckout() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		ProductPage products = new ProductPage(driver);
		products.addProduct();
		
		CheckoutPage cp = new CheckoutPage(driver);
		cp.completeCheckout();
	}

}
