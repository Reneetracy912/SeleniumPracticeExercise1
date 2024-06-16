package newproject;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Arraycart {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");


//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");


		//WebDriver driver = new ChromeDriver();
//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--remote-allow-origins=*");
//				ChromeDriver driver = new ChromeDriver(options);
				//declaring globally implicit wait to tell selenium for wait 5 secs for ever scenario
				//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			

		//writing array to store the cart items

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		//* should be included since we are getting the text format for image
		driver.findElement(By.cssSelector("img[alt*='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		// selecting all the webelements values names  totally 30 elements names will be selected

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)
       //for list element getting the size will use size()
	  //iterating through the loop to get the expected items name from the cart
		{

     //actual name in website is Cucumber - 1 Kg, to get the exact name we are splitting between '-'
			String[] name = products.get(i).getText().split("-");
			//Brocolli - 1 Kg ---> [0]=Brocolli , [1]=1 kg
			String formattedName = name[0].trim(); //to trim the whitespace after brocoli

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);
			
//check whether the formated names are there in converted arraylist,if there it will go inside loop for clicking

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)
					//length

				{

					break;

				}

			}

		}

	}

}
