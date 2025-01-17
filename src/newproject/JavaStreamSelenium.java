package newproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class JavaStreamSelenium {
	public static void main(String[] args)throws InterruptedException { {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\reneetracy.vr\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
	// click on column

	driver.findElement(By.xpath("//tr/th[1]")).click();



	// capture all webelements into list

	List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));



	// capture text of all webelements into new(original) list

	List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());



	// sort on the original list of step 3 -> sorted list



	List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

	// compare original list vs sorted list

	Assert.assertTrue(originalList.equals(sortedList));

	List<String> price;

	// scan the name column with getText ->Beans->print the price of the Rice

	do

	{

	List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

	price = rows.stream().filter(s -> s.getText().contains("Rice"))

	.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

	price.forEach(a -> System.out.println(a));

	if(price.size()<1)

	{

	driver.findElement(By.cssSelector("[aria-label='Next']")).click();

	}

	}while(price.size()<1);

	}

	}



	private static String getPriceVeggie(WebElement s) {

	// TODO Auto-generated method stub

	String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



	return pricevalue;

	
	

}
}