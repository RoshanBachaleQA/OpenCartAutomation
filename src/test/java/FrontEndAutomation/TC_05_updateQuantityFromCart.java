package FrontEndAutomation;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_updateQuantityFromCart extends BaseClass_openCart{

	@BeforeClass
	void setupTest() throws IOException {
		setup();
	}
	
	
	
	@Test(groups= {"functionality"})
	void updateQuantityOfPrdFromCart() throws InterruptedException {
		try {

			HomePageOC homePagevar=new HomePageOC(driver);
			homePagevar.clickHeaderMyAccount();
			
			login("roshanbachale328@gmail.com", "Pass@1234$");

			Thread.sleep(2000);
			
			CartPage  cartvar=new CartPage(driver);
			cartvar.clickHeaderCartOption();
			
			Thread.sleep(1000);
			cartvar.clearInputFieldOfQuantityFromCart();
			
			cartvar.updateQuantityFromCart("22");
			Thread.sleep(1000);
			cartvar.clickUpdateButtonFromCart();
			

			System.out.println("-------------  Test Ended  -------------");
		}catch(Exception e) {
			System.out.println("Exception Occured");
			Assert.fail("Test case Failed: \n" + e.getMessage());
		}
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
