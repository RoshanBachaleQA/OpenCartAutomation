package FrontEndAutomation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_09_AddToCartProductFromWishList extends BaseClass_openCart{

	@BeforeClass
	void setupTest() throws IOException {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException {
		try {

			HomePageOC homepagevar = new HomePageOC(driver);
			homepagevar.clickHeaderMyAccount();

			login(propertyObj.getProperty("email"), propertyObj.getProperty("password"));
			
			Thread.sleep(2000);
			
			wishlistPage wishlistvar = new wishlistPage(driver);
			wishlistvar.clickWishlistFromMainMenu();
			System.out.println(driver.getTitle());
			
			
			wishlistvar.clickAddToCartFromWishList();
			Thread.sleep(2000);
			

			System.out.println("-------------  Test Ended  -------------");
		}catch(Exception e) {
			System.out.println("Exception Occured");
			Assert.fail("Test Case Failed: \n"+ e.getMessage());
		}
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
