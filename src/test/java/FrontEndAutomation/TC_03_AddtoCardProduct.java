package FrontEndAutomation;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_03_AddtoCardProduct extends BaseClass_openCart{

	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	
	
	@Test(groups= {"sanity", "regression", "smoke"})
	void searchProducts() throws InterruptedException {
		
		HomePageOC homePagevar=new HomePageOC(driver);
		homePagevar.clickHeaderMyAccount();
		
		login("roshanbachale328@gmail.com", "Pass@1234$");
		
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
				Thread.sleep(2000);
				prdlink.click();
				
				break;
			}
		}
		
		CartPage cartvar = new CartPage(driver);
		cartvar.clearInputFieldQuantitySeachPrd();
		cartvar.clickSendQuantityFromSearchedPrd("15");
		cartvar.clickAddToCartButtomFromSearchedPrd();

		System.out.println("-------------  Test Ended  -------------");
	}
	
	
	@AfterClass
	void teardownTest() {
		teardown();
	}

	
}
