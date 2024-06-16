package newproject;
import java.util.List;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingRealLifeCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//1. Give me the count of links on the page.
		//2. Count of footer section-
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		// WebDriver driver =new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23
		//selecting date of travel box
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		//driver.findElementByXPath(".//*[@id='travel_date']").click();
//selecting specific month
        //getting the common locators for month by using parent child[][] way of locating the locators and checking them in a while loop
		//while loop execute till the condition becomes false
		//here initially we are checking whether the returing month is april,
		//but first it will return some other month and loop will tell false and we are making into true(!) to get into the loop to click the arrow of the next month until it reaches the april

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
//for selecting specific date
		//getting the common class that has all the days in it,so that we can iterate and execute
		

		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		//getting count 
		int count=driver.findElements(By.className("day")).size();
        
		for(int i=0;i<count;i++)
		{
	   //getting the text of the iterator by .get() and text of the iterator by .getText() //
		String text=driver.findElements(By.className("day")).get(i).getText();
		//checking expected date === output from the above line
		if(text.equalsIgnoreCase("21"))
			
		{
			//click the date and break
		driver.findElements(By.className("day")).get(i).click();
		break;
		}

		}
		}

		}