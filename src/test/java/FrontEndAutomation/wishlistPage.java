package FrontEndAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wishlistPage {
	WebDriver driver;
	
	wishlistPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locators
	
	By wishlistFromMainMenu = By.id("wishlist-total");
	By addToCartFromWishlist = By.xpath("//button[@type='submit']");
	By removeButtonFromWishlist = By.linkText("Remove");
	By continueButtonFromWishlist = By.linkText("Continue");
	
	//Action Methods
	public void clickWishlistFromMainMenu() {
		driver.findElement(wishlistFromMainMenu).click();
	}
	
	public void clickAddToCartFromWishList() {
		driver.findElement(addToCartFromWishlist).click();
	}
	
	public void clickRemoveButtonFromWishlist() {
		driver.findElement(removeButtonFromWishlist).click();
	}
	
	public void clickContinueFromWishlist() {
		driver.findElement(continueButtonFromWishlist).click();
	}
	
}
