package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_updateQuantityFromCart {
	
	WebDriver driver;
	@BeforeClass
	void Setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opencart.localhost/");
		driver.manage().window().maximize();
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
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
		System.out.println("***  Test Ended  ****");
	}
}
