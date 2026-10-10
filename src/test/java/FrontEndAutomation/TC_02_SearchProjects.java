package FrontEndAutomation;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_02_SearchProjects extends BaseClass_openCart{
	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	
	@Test(groups= {"sanity","smoke", "regression"})
	void searchProducts() throws InterruptedException {
		
		HomePageOC homepagevar=new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
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
				
				//wrongly used this explicit wait 
				//WebElement targetprdlink = wait.until(ExpectedConditions.elementToBeClickable(prdlink));
				
				Thread.sleep(1000);
				prdlink.click();
				break;
			}
		}

		System.out.println("-------------  Test Ended  -------------");
	}
	
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
