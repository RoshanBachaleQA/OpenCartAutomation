package FrontEndAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPageOC {
	WebDriver driver;
	
	//driver
	loginPageOC(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//locator 
	By login_popup = By.linkText("Login");
	By email_field = By.xpath("//input[@name='email' and @id='input-email']");
	By password_field = By.xpath("//input[@id='input-password' and @name='password']");
	By loginbutton = By.xpath("//button[@type='submit' and @class='btn btn-primary']");
	
	//Action Methods
	public void clickLoginPopup() {
		driver.findElement(login_popup).click();
	}
	
	public void setEmail(String email) {
		driver.findElement(email_field).sendKeys(email);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password_field).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginbutton).click();
	}

}
