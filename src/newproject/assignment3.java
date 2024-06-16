package newproject;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class assignment3 {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='admin']/following-sibling::span")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.switchTo().alert().accept();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> products =  driver.findElements(By.cssSelector("button.btn.btn-info"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();}
		}
		
		
		
/*import java.time.Duration;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;







import org.openqa.selenium.Keys;







import org.openqa.selenium.WebDriver;







import org.openqa.selenium.WebElement;







import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;







public class Assignment2 {







public static void main(String[] args) throws InterruptedException {









System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");







WebDriver driver=new ChromeDriver();







driver.get("https://rahulshettyacademy.com/loginpagePractise/");





driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("password")).sendKeys("learning");

driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

//Thread.sleep(3000);

WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

driver.findElement(By.id("okayBtn")).click();

WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

Select dropdown = new Select(options);

dropdown.selectByValue("consult");

driver.findElement(By.id("signInBtn")).click();







wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

for(int i =0;i<products.size();i++)

{

products.get(i).click();

}

driver.findElement(By.partialLinkText("Checkout")).click();}







}

Your submission
RR
Renee Tracy V R
Posted A few seconds ago
Complete the Assignment and post the working code here.

package newproject;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class assignment3 {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='admin']/following-sibling::span")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.switchTo().alert().accept();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> products =  driver.findElements(By.cssSelector("button.btn.btn-info"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		}
		
		
		
}*/


