package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BaseClass_openCart {
	public WebDriver driver;
	
	
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("http://opencart.localhost/");	//launching the Website on browser
        driver.manage().window().maximize();		//For maximizing the window
        System.out.println("Setup Successful");
	}
	
	public void teardown() {
		driver.quit();
		System.out.println("Tear Down Successful");
	}
	
	public void login(String email, String Password) {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@name='email' and @id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Account Login");
		System.out.println("Logged In");
	}
	
}
