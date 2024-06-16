package newproject;

import org.openqa.selenium.By;



import org.openqa.selenium.Keys;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;



public class Autosuggestivedropdown2 {



public static void main(String[] args) throws InterruptedException {



// TODO Auto-generated method stub



	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

// WebDriver driver =new ChromeDriver();

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);

    driver.get("http://qaclickacademy.com/practice.php");

    driver.findElement(By.id("autocomplete")).sendKeys("ind");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       

       

}

}
