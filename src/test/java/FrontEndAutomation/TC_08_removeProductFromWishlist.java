package FrontEndAutomation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_08_removeProductFromWishlist extends BaseClass_openCart{
	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException {
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		login("roshanbachale328@gmail.com", "Pass@1234$");
		
		Thread.sleep(2000);
		
		wishlistPage wishlistvar = new wishlistPage(driver);
		wishlistvar.clickWishlistFromMainMenu();
		System.out.println(driver.getTitle());
		
		
		wishlistvar.clickRemoveButtonFromWishlist();
		

		System.out.println("-------------  Test Ended  -------------");
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
