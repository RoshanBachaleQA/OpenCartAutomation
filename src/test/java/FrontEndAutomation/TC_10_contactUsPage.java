package FrontEndAutomation;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_10_contactUsPage extends BaseClass_openCart{

	@BeforeClass
	void setupTest() {
		setup();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException, IOException {
		
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
	}
	
	@AfterClass
	void teardownTest() {
		teardown();
	}
}
