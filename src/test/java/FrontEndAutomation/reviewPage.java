package FrontEndAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reviewPage {
	
	WebDriver driver;
	
	reviewPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	//Locator
	By reviewTab = By.linkText("Write a review");
	
	By reviewDescription = By.id("input-text");
	By reviewRatingRadioButtons1 = By.xpath("//input[@type='radio' and @name='rating' and @value='1']");
	By reviewRatingRadioButtons2 = By.xpath("//input[@type='radio' and @name='rating' and @value='2']");
	By reviewRatingRadioButtons3 = By.xpath("//input[@type='radio' and @name='rating' and @value='3']");
	By reviewRatingRadioButtons4 = By.xpath("//input[@type='radio' and @name='rating' and @value='4']");
	By reviewRatingRadioButtons5 = By.xpath("//input[@type='radio' and @name='rating' and @value='5']");
	
	By continueButtonLoc = By.id("button-review");
	
	//Action Methods
	public void clickOnWriteReview() {
		WebElement reviewlink = driver.findElement(reviewTab);
		reviewlink.click();
	}
	
	public void provideReview(String review) throws InterruptedException {
		WebElement reviewdis=driver.findElement(reviewDescription);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", reviewdis);
		Thread.sleep(1000);
		
		reviewdis.sendKeys(review);
	}
	
	public void provideReviewRatingRadioButtons(int no) throws InterruptedException {
		if(no==1) {
			Thread.sleep(2000);
			WebElement worst = driver.findElement(reviewRatingRadioButtons1);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", worst);
			worst.click();
			
		}
		else if(no==2) {
			Thread.sleep(2000);
			WebElement good =driver.findElement(reviewRatingRadioButtons2);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", good);
			good.click();
			
		}else if(no==3) {
			Thread.sleep(2000);
			WebElement better = driver.findElement(reviewRatingRadioButtons3);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", better);
			better.click();
			
		}else if(no==4) {
			Thread.sleep(2000);
			WebElement best = driver.findElement(reviewRatingRadioButtons4);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", best);
			best.click();
			
		}else if(no == 5) {
			Thread.sleep(2000);
			WebElement excellent = driver.findElement(reviewRatingRadioButtons5);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", excellent);
			excellent.click();
			
		}else {
			System.out.println("You have given wrong input. please provide right one");
		}
		
	}
	
	
	public void clickOnContinueButton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(continueButtonLoc);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", continueButton);
		
		continueButton.click();
	}
	
}
