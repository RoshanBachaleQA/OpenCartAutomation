package FrontEndAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
	
	WebDriver driver;
	
	searchPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locators 
	By productLinks = By.tagName("a");
	By searchCartPrdButton = By.xpath("//button[@type='submit' and @data-bs-toggle='tooltip' and @aria-label='Add to Cart' and @data-bs-original-title='Add to Cart']");
	By searchPrdAddWishlist = By.xpath("//button[@type='submit' and @data-bs-toggle='data-bs-toggle' and @aria-label='Add to Wish List' and @data-bs-original-title='Add to Wish List']]");
	By compareSearchPrdButton = By.xpath("//button[@type='submit' and @data-bs-toggledata-bs-toggle='tooltip' and @aria-label='Compare this Product' and @data-bs-original-title='Compare this Product']");
	
	//Action Methods
	
	public List<WebElement> getProductLinks() {
		return driver.findElements(productLinks);
	}
	
	public void clickSearchPrdCartButton() {
		driver.findElement(searchCartPrdButton).click();
	}
	
	public void clickSearchPrdWishlistButton() {
		driver.findElement(searchPrdAddWishlist).click();
	}
	
	public void clickSearchPrdCompareButton() {
		driver.findElement(compareSearchPrdButton).click();
	}
	
	
}
