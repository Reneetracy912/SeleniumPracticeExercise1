package newproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;



public class calendar {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

//WebDriver driver =new ChromeDriver();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//calendar date not working
//driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

//radio button 
//handling disenabled dropdown
//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//return date is not enabled without clicking round trip
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//return trip is enabled if click on round trip
//sometimes the locators may be disabled but the only difference is there may be a difference in opacity therefore we need to check the opacity value and confirm whether it is enabled or not
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
	System.out.println("Its enabled");
	Assert.assertTrue(true);
}
else {
	Assert.assertTrue(false);	
}
}



}
