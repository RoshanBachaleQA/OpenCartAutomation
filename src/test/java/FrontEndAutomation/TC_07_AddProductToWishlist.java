package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_07_AddProductToWishlist {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.get("http://opencart.localhost/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(groups= {"functionality"})
	void addprodutToWishlist() throws InterruptedException {
		
		HomePageOC homepagevar = new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
		loginPageOC lg = new loginPageOC(driver);
		lg.clickLoginPopup();
		lg.setEmail("roshanbachale328@gmail.com");
		lg.setPassword("Pass@1234$");
		lg.clickLogin();
		
		Thread.sleep(2000);
		
		wishlistPage wishlistvar = new wishlistPage(driver);
		wishlistvar.clickWishlistFromMainMenu();
		System.out.println(driver.getTitle());
		
		
		wishlistvar.clickAddToCartFromWishList();
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
		System.out.println("Test Ended");
	}
}
