package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_06_checkoutProducts {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opencart.localhost/");
		driver.manage().window().maximize();
	}
	
	@Test(groups= {"functionality"})
	void checkoutproducts() throws InterruptedException {
		
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		loginPageOC login=new loginPageOC(driver);
		login.clickLoginPopup();
		login.setEmail("roshanbachale328@gmail.com");
		login.setPassword("Pass@1234$");
		login.clickLogin();
		
		Thread.sleep(2000);
		
		checkoutPage checkoutvar = new checkoutPage(driver);
		checkoutvar.clickCheckoutFromMenu();
		checkoutvar.provideCommentOnOrder("I am confirming this order");
		checkoutvar.clickConfirmOrderButton();
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
		System.out.println("****  Test Ended  ****");
	}
}
