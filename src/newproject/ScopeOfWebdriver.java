package newproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScopeOfWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//1. Give me the count of links on the page.
		//2. Count of footer section-
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		// WebDriver driver =new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://qaclickacademy.com/practice.php");
		//Collecting all the links by using anchor tags(a) such that only links will be hitted which are present in the web 
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//limiting the scope of the webdriver by providing webelement of the footer and giving them in a web element and using that to hit the footer alone
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		//Using that webelement specifically to get the anchor tags(links) of the footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Going to specific coloumn inside that footer by using the same mechanisgm of above step for specific colomn in footer by collecting webelelemnt of that coloum and getting all links of that particular coloumn
		//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			//By clicking on ctrl+enter links will open in separate tab, instead of opening in single window clicking again and coming back to the home page again, by following that clicking opyion all the tab will open at a time separately 
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//sending the keyword 
			// opens all the tabs
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}
		//After opening all the tab,we are sending number of tabs are there in the window using windows handle and set
		Set<String> abc=driver.getWindowHandles();//4
		//iterator helps to iterate through the tab providing them a index[0]
		Iterator<String> it=abc.iterator();
		//has next method helps to check whether ntabs are there in the next index or not
		while(it.hasNext())
		{
			//now index will be 0 if it click through next then it will be 1,and it keeps on move
		   driver.switchTo().window(it.next());
		   //getting the text and printing
		   System.out.println(driver.getTitle()); 
		
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}