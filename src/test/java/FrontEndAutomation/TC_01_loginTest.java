package FrontEndAutomation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01_loginTest extends BaseClass_openCart {

	
	@BeforeClass
	void setupTest() {
		setup();
	}
	
	
	@Test(groups={"smoke", "sanity", "regression", "functionality"})
	void loginTest() {
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		
		loginPageOC lg = new loginPageOC(driver);
		lg.clickLoginPopup();
		lg.setEmail("roshanbachale328@gmail.com");
		lg.setPassword("Pass@1234$");
		lg.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "Account Login");

		System.out.println("-------------  Test Ended  -------------");
	}
	
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
