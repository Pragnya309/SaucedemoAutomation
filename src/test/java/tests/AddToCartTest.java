package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
	@Test
	public void addProductToCart() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		ProductPage products = new ProductPage(driver);
		products.addProduct();
		
	}

}
