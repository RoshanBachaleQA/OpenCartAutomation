package FrontEndAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	WebDriver driver;
	
	checkoutPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locators
	
	By checkFromMenu = By.linkText("Checkout");
	
	By paymentMethodloc = By.id("button-payment-methods");
	By orderComment = By.id("input-comment");
//	By confirmOrderButton = By.linkText("Confirm Order");
	By confirmOrderButton = By.xpath("//button[@type='button'][@class='btn btn-primary']");
	
	//Action methods
	public void clickCheckoutFromMenu() {
		driver.findElement(checkFromMenu).click();
	}
	
	public void clickPaymentMethodButton() {
		driver.findElement(paymentMethodloc).click();
	}
	
	public void provideCommentOnOrder(String comment) {
		driver.findElement(orderComment).sendKeys(comment);
	}
	
	public void clickConfirmOrderButton() {
		driver.findElement(confirmOrderButton).click();
	}
}
