package FrontEndAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_06_checkoutProducts extends BaseClass_openCart {
	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void checkoutproducts() throws InterruptedException {
		
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		login("roshanbachale328@gmail.com", "Pass@1234$");
		
		Thread.sleep(2000);
		
		checkoutPage checkoutvar = new checkoutPage(driver);
		checkoutvar.clickCheckoutFromMenu();
		checkoutvar.provideCommentOnOrder("I am confirming this order");
		checkoutvar.clickConfirmOrderButton();
		

		System.out.println("-------------  Test Ended  -------------");
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
