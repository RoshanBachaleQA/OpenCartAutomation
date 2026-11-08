package FrontEndAutomation;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_04_RemoveProductFromCart extends BaseClass_openCart{

	@BeforeClass
	void setupTest() throws IOException {
		setup();
	}
	
	
	@Test(groups= {"functionality", "regression"})
	void removePrdFromCart() throws InterruptedException {
		try {

			HomePageOC homepagevar = new HomePageOC(driver);
			homepagevar.clickHeaderMyAccount();
			

			login(propertyObj.getProperty("email"), propertyObj.getProperty("password"));
			
			Thread.sleep(1000);
			
			CartPage cartvar = new CartPage(driver);
			cartvar.clickHeaderCartOption();
			
			Thread.sleep(2000);
			
			
			cartvar.clickRemovePrdFromCart();
			Thread.sleep(2000);
			
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
