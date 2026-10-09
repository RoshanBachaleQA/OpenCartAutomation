package FrontEndAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageOC {
	
	WebDriver driver;

	HomePageOC(WebDriver driver){
		this.driver=driver;
	}
	
	//Locator 
	By homepage = By.xpath("//img[@title='Your Store' and @alt='Your Store' and @class='img-fluid']");
	By searchField = By.xpath("//input[@type='text' and @name='search']");
	By searchButton = By.xpath("//button[@type='submit' and @class='btn btn-light btn-lg']");
	
	By desktopMenu = By.linkText("Desktops");
	By laptopNotebookMenu = By.linkText("Laptops & Notebooks");
	By componenetMenu = By.linkText("Components");
	By tabletsMenu = By.linkText("Tablets");
	By softwareMenu = By.linkText("Software");
	By phoenPDAMenu = By.linkText("Phones & PDAs");
	By cameraMenu = By.linkText("Cameras");
	By mp3layerMenu = By.linkText("MP3 Players");
	
	By myAccountHeader = By.xpath("//span[@class='d-none d-lg-inline']");
	
	
	//Action methods
	public void moveToHomePage() {
		driver.findElement(homepage).click();
	}
	
	public void homepageSearchField(String productname) {
		driver.findElement(searchField).sendKeys(productname);
	}
	
	public void homepageSearchButton() {
		driver.findElement(searchButton).click();
	}
	
	public void desktopMenuaction() {
		driver.findElement(desktopMenu).click();
	}
	
	public void laptopNotebookMenuAction() {
		driver.findElement(laptopNotebookMenu).click();
	}
	
	public void componenetMenuAction() {
		driver.findElement(componenetMenu).click();
	}
	
	public void tabletsMenuAction() {
		driver.findElement(tabletsMenu).click();
	}
	
	public void softwareMenuAction() {
		driver.findElement(softwareMenu).click();
	}
	
	public void phoenPDAMenuAction() {
		driver.findElement(phoenPDAMenu).click();
	}
	
	public void cameraMenuAction() {
		driver.findElement(cameraMenu).click();
	}
	
	public void mp3layerMenuAction() {
		driver.findElement(mp3layerMenu).click();
	}
	
	public void clickHeaderMyAccount() {
		List<WebElement> links = driver.findElements(myAccountHeader);
		for(WebElement link:links) {
			if(link.getText().equals("My Account")) {
				link.click();
				break;
			}
		}
	}
	
}
