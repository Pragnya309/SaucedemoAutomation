package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		
	}
	By checkout = By.id("checkout");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By zip = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");
	public void completeCheckout() {
		driver.findElement(checkout).click();
		driver.findElement(firstname).sendKeys("Test");
		driver.findElement(lastname).sendKeys("User");
		driver.findElement(zip).sendKeys("500053");
		driver.findElement(continueBtn).click();
		driver.findElement(finishBtn).click();
	}
}
