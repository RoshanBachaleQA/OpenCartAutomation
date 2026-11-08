package FrontEndAutomation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_10_contactUsPage extends BaseClass_openCart{

	@BeforeClass
	void setupTest() throws IOException {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException, IOException {
		try {
			HomePageOC homepagevar = new HomePageOC(driver);
			homepagevar.clickHeaderMyAccount();
			
			login("roshanbachale328@gmail.com", "Pass@1234$");
			
			Thread.sleep(2000);
			
			contactUsPage contactusvar = new contactUsPage(driver);
			contactusvar.clickContactUsFromHeader();
			
			Thread.sleep(1000);
			
			contactusvar.sendEnquiryDescription("Testing enquiry Field ");
			contactusvar.clickSubmitButtonFromContactUS();
			
			Thread.sleep(5000);
			

			System.out.println("-------------  Test Ended  -------------");
		}catch(Exception e) {
			System.out.println("Exception Occured");
			Assert.fail("Test Case Failed: \n"+e.getMessage());
		}

	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
