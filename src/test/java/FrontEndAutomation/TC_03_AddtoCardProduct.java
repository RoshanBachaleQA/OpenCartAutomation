package FrontEndAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_03_AddtoCardProduct {

	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opencart.localhost/");
		driver.manage().window().maximize();


		
	}
	
	
	@Test(groups= {"sanity", "regression", "smoke"})
	void searchProducts() throws InterruptedException {
		
		HomePageOC homePagevar=new HomePageOC(driver);
		homePagevar.clickHeaderMyAccount();
		
		loginPageOC login=new loginPageOC(driver);
		login.clickLoginPopup();
		login.setEmail("roshanbachale328@gmail.com");
		login.setPassword("Pass@1234$");
		login.clickLogin();
		
		HomePageOC homevar=new HomePageOC(driver);
		homevar.moveToHomePage();
		homevar.homepageSearchField("MacBook");
		homevar.homepageSearchButton();
		
		searchPage searchprdvar = new searchPage(driver);
		List<WebElement> links = searchprdvar.ClickProductLinks();
		
		
		
		for(WebElement prdlink: links) {
			
			if(prdlink.getText().equals("MacBook")) {
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", prdlink);		//move till the element is visible 
				Thread.sleep(2000);
				prdlink.click();
				
				break;
			}
		}
		
		CartPage cartvar = new CartPage(driver);
		cartvar.clearInputFieldQuantitySeachPrd();
		cartvar.clickSendQuantityFromSearchedPrd("15");
		cartvar.clickAddToCartButtomFromSearchedPrd();
		
	}
	
	
	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	
}
