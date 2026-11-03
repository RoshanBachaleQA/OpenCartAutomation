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
		try {

			HomePageOC homepagevar = new HomePageOC(driver);
			homepagevar.clickHeaderMyAccount();
			
			login("roshanbachale328@gmail.com", "Pass@1234$");

			System.out.println("-------------  Test Ended  -------------");
		}catch(Exception e) {
			System.out.println("Exception Occurs :- " + e);
			Assert.fail("Test Case Failed: \n" +  e.getMessage());
		}
		
	}
	
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
	
}
