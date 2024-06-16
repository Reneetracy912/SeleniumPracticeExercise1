package newproject;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class autoSuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		// WebDriver driver =new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser
		driver.findElement(By.id("autosuggest")).sendKeys("Briti");
		Thread.sleep(3000);
		// return type of findelelements is list
		// this csss selector returns multiple locators for auto suggestive dropdown and
		// we are getting them by find elements with list resturn element
		List<WebElement> opt = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		// decaring web element opt1 to iterate through the loop
		for (WebElement opt1 : opt) {
			if (opt1.getText().equalsIgnoreCase("British Indian Ocean Territory")) {
				System.out.println(opt1.getText());
				opt1.click();

			}

		}

	}
}