package FrontEndAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass_openCart {
	public static WebDriver driver;
	
	public static void initializeBrowser() {
		//--------------------------------------------------------------------------
		//remove text - Chrome is controlled by automated test software
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		//WebDriver driver=new ChromeDriver(option);  --> you need to pass option variable like this.
		//-----------------------------------------------------------------------
		option.addArguments("--incognito");  //running test in Incognito mode 
		
		driver=new ChromeDriver(option);
		driver.get("http://opencart.localhost/");	//launching the Website on browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//implicit wait
        driver.manage().window().maximize();		//For maximizing the window
        
	}
	
	public static void teardown() {
		if(driver != null) {
			driver.quit();
		}
	}
	
}
