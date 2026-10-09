package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
	
}
