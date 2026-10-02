package FrontEndAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {
	
	
	WebDriver driver;
	
	CartPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locator 
	By cartButtonOfSearchProduct = By.id("button-cart"); //locator from Searched Product Screen
	By QuantityOfProduct = By.id("input-quantity"); //locator from Searched Product Screen
	
	By headerCart = By.linkText("Shopping Cart"); //header locator
	
	By removePrdLocFromCart = By.xpath("//a[contains(@data-bs-original-title,'Remove')]");
	By updateQuantityFieldFromCart = By.xpath("//input[@name='quantity']");
	By updatePrdButtonFromCart = By.xpath("//button[@aria-label='Update' or @type='submit']");
	
	By checkoutButtonFromCart = By.linkText("Checkout");
	
	//Action Methods
	
	public void clickAddToCartButtomFromSearchedPrd() {
		driver.findElement(cartButtonOfSearchProduct).click();
	}
	
	public void clickSendQuantityFromSearchedPrd(String quantity) {
		driver.findElement(QuantityOfProduct).sendKeys(quantity);
	}
	
	public void clearInputFieldQuantitySeachPrd() {
		driver.findElement(QuantityOfProduct).clear();
	}
	
	
	public void clickHeaderCartOption() {
		driver.findElement(headerCart).click();
	}
	
	public void clickRemovePrdFromCart() {
		driver.findElement(removePrdLocFromCart).click();
	}
	
	public void clearInputFieldOfQuantityFromCart() {
		driver.findElement(updateQuantityFieldFromCart).clear();
	}
	
	public void updateQuantityFromCart(String quantityField) {
		driver.findElement(updateQuantityFieldFromCart).sendKeys(quantityField);
	}
	
	public void clickUpdateButtonFromCart() {
		driver.findElement(updatePrdButtonFromCart).click();
	}
	
	public void clickCheckoutButtonFromCart() {
		driver.findElement(checkoutButtonFromCart).click();
	}
}
