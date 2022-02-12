package tests;

import org.testng.annotations.Test;

import pageObjects.YatraHmPg;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class YatraHomeTest {
	WebDriver driver;
	YatraHmPg yatraHmPg;
		
  @Test
  public void verifyYatraPage() {
	  
	  yatraHmPg.clickOnYatraLogo();
	  
	  yatraHmPg.verifyYatraLogo();  
  }
   
  
  @Test
  public void verifyHotelsLink() {
	  
	  yatraHmPg.clickOnHotels();
	  
	  yatraHmPg.verifyHotelLink();  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.yatra.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  yatraHmPg = new YatraHmPg(driver);
	  
	  
		  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
