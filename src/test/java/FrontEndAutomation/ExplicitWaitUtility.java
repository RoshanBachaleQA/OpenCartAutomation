package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUtility {
	WebDriver driver;
	WebDriverWait wait;
	
	public ExplicitWaitUtility(WebDriver driver, int timeout){
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
	}
	
	
	//common wait methods
	public WebElement waitForElementVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementIsClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
}
