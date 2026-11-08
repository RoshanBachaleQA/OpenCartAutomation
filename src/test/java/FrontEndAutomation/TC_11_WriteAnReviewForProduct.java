package FrontEndAutomation;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_11_WriteAnReviewForProduct extends BaseClass_openCart{
	
	@BeforeClass
	void setupTest() throws IOException {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void searchProducts() throws InterruptedException {
		try {
			HomePageOC homepagevar=new HomePageOC(driver);
			homepagevar.clickHeaderMyAccount();

			login(propertyObj.getProperty("email"), propertyObj.getProperty("password"));
			
			Thread.sleep(1000);
			
			HomePageOC homevar=new HomePageOC(driver);
			homevar.moveToHomePage();
			homevar.homepageSearchField("MacBook");
			homevar.homepageSearchButton();
			
			searchPage searchprdvar = new searchPage(driver);
			List<WebElement> links = searchprdvar.getProductLinks();
			
			
			for(WebElement prdlink: links) {
				
				if(prdlink.getText().equals("MacBook")) {
					JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true)", prdlink);		//move till the element is visible 
					Thread.sleep(1000);
					prdlink.click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			reviewPage reviewvar = new reviewPage(driver);
			reviewvar.clickOnWriteReview();
			reviewvar.provideReview("I am testing the review using automation");
			
			
			
			
			reviewvar.provideReviewRatingRadioButtons(1);
			
			reviewvar.clickOnContinueButton();
			

			System.out.println("-------------  Test Ended  -------------");
		}catch(Exception e) {
			System.out.println("Exception Occured");
			Assert.fail("Test case Failed: \n"+ e.getMessage());
		}
	}
	
	
	@AfterClass
	void teardownTest() {
		teardown();
	}

	
}
