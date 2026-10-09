package FrontEndAutomation;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_updateQuantityFromCart extends BaseClass_openCart{

	@BeforeClass
	void setupTest() {
		setup();
	}
	
	
	
	@Test(groups= {"functionality"})
	void updateQuantityOfPrdFromCart() throws InterruptedException {
		
		HomePageOC homePagevar=new HomePageOC(driver);
		homePagevar.clickHeaderMyAccount();
		
		loginPageOC login=new loginPageOC(driver);
		login.clickLoginPopup();
		login.setEmail("roshanbachale328@gmail.com");
		login.setPassword("Pass@1234$");
		login.clickLogin();
		
		Thread.sleep(2000);
		
		CartPage  cartvar=new CartPage(driver);
		cartvar.clickHeaderCartOption();
		
		Thread.sleep(1000);
		cartvar.clearInputFieldOfQuantityFromCart();
		
		cartvar.updateQuantityFromCart("22");
		Thread.sleep(1000);
		cartvar.clickUpdateButtonFromCart();
		

		System.out.println("-------------  Test Ended  -------------");
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
