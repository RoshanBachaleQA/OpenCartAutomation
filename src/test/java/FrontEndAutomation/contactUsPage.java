package FrontEndAutomation;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactUsPage {

		WebDriver driver;
		
		contactUsPage(WebDriver driver){
			this.driver=driver;
		}
		
		//Locator
		By contactUsFromHomePage = By.tagName("span"); //from Homepage
		
		By enquiryField = By.id("input-enquiry");
		By submitButton = By.tagName("button");
		
		
		//Action Methods 
		
		public void clickContactUsFromHeader() {
			List<WebElement> links = driver.findElements(contactUsFromHomePage);
			for(WebElement link: links) {
				if(link.getText().equals("123456789")) {
					link.click();
					break;
				}
			}
			
		}
		
		public void sendEnquiryDescription(String enquiry) {
			driver.findElement(enquiryField).sendKeys(enquiry);
		}
		
		public void clickSubmitButtonFromContactUS() throws IOException, InterruptedException {
			List<WebElement> buttonlinks = driver.findElements(submitButton);
			
			for(WebElement link: buttonlinks) {
				//System.out.println(links.getText());
				if(link.getText().trim().equalsIgnoreCase("Submit")) {
					JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(false);", link);
					Thread.sleep(1000);
					link.click();
					break;
				}
				
				
			}
		}
}
