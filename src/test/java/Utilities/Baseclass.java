package Utilities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class Baseclass {
 
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  public  void browser(String browsername, String url) throws InterruptedException {
		
		//String ud=System.getProperty("usr.dir");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\URMIN\\OneDrive\\Documents\\ProjectTestNG\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			Thread.sleep(3000);
			//driver.get("https://www.facebook.com/");
			driver.get(url);
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\URMIN\\OneDrive\\Documents\\ProjectTestNG\\Drivers\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();

			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.get(url);
			
		}

}
