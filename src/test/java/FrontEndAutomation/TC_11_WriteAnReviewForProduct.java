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

public class TC_11_WriteAnReviewForProduct {

	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opencart.localhost/");
		driver.manage().window().maximize();
		
		HomePageOC homepagevar=new HomePageOC(driver);
		homepagevar.clickHeaderMyAccount();
		
	}
	
	
	@Test(groups= {"functionality"})
	void searchProducts() throws InterruptedException {
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
				Thread.sleep(1000);
				prdlink.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		reviewPage reviewvar = new reviewPage(driver);
		reviewvar.clickOnWriteReview();
		reviewvar.provideReview("I am testing the review using automation");
		
		
		
		
		reviewvar.provideReviewRatingRadioButtons(1);
		
		reviewvar.clickOnContinueButton();
		
	}
	
	
	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	
}
