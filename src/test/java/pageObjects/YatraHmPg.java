package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class YatraHmPg {

	WebDriver driver;

	public YatraHmPg(WebDriver driver) { // TODO Auto-generated constructor stub
		this.driver = driver;

	}

	public void clickOnYatraLogo() {

		driver.findElement(By.cssSelector("a>i[class=\"ico-newHeaderLogo\"]")).click();
		printMsg("Yatra pe click ker diya be");

	}

	public void clickOnHotels() {

		driver.findElement(By.cssSelector("#booking_engine_hotels > div > span")).click();
		printMsg("Hotels pe click ker diya be");

	}

	public void printMsg(String msg) {

		System.out.println(msg + " Good Job");

	}

	public void verifyYatraLogo() {
		String expectedValue = "https://www.yatra.com/";
		String currentValue = driver.getCurrentUrl();
		Assert.assertEquals(currentValue, expectedValue);
		printMsg("Yatra Logo URL checked");
	}

	public void verifyHotelLink() {
		String expectedValue = "https://www.yatra.com/hotels";
		String currentValue = driver.getCurrentUrl();
		Assert.assertEquals(currentValue, expectedValue);
		printMsg("Hotel URL checked");

	}

}
