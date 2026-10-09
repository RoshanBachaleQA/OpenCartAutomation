package FrontEndAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_07_AddProductToWishlist extends BaseClass_openCart{
	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException {
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		loginPageOC lg = new loginPageOC(driver);
		lg.clickLoginPopup();
		lg.setEmail("roshanbachale328@gmail.com");
		lg.setPassword("Pass@1234$");
		lg.clickLogin();
		
		Thread.sleep(2000);
		
		wishlistPage wishlistvar = new wishlistPage(driver);
		wishlistvar.clickWishlistFromMainMenu();
		System.out.println(driver.getTitle());
		
		
		wishlistvar.clickAddToCartFromWishList();
		

		System.out.println("-------------  Test Ended  -------------");
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
