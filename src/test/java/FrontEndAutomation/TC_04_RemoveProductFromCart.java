package FrontEndAutomation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_04_RemoveProductFromCart extends BaseClass_openCart{

	@BeforeClass
	void setupTest() {
		setup();
	}
	
	
	@Test(groups= {"functionality", "regression"})
	void removePrdFromCart() throws InterruptedException {
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		loginPageOC lg = new loginPageOC(driver);
		lg.clickLoginPopup();
		lg.setEmail("roshanbachale328@gmail.com");
		lg.setPassword("Pass@1234$");
		lg.clickLogin();
		
		Thread.sleep(1000);
		
		CartPage cartvar = new CartPage(driver);
		cartvar.clickHeaderCartOption();
		
		Thread.sleep(2000);
		
		
		cartvar.clickRemovePrdFromCart();
		Thread.sleep(2000);
		
		System.out.println("-------------  Test Ended  -------------");
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
