package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");	
				ChromeDriver driver = new ChromeDriver(options);	
				
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
// selecting one way trip 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//from 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//to
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//calendar
		//Departure date
		
		//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		//xpath-//a[@class='ui-state-default ui-state-highlight ui-state-hover']
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		//making sure return trip date is disabled for one way trip
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);	
		}
		
//checkbox
	   driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	 
//adding adults
	   driver.findElement(By.id("divpaxinfo")).click();
	   Thread.sleep(2000L);
	   for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		//the below text should return be true if two arguments are returning true
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//search
		//customised css selector
		driver.findElement(By.cssSelector("input[value='Search']")).click();
        //customised x path
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
        //by name locator
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
	}
}
	

