package newproject;

	import java.time.Duration;
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



	public class Synchronization  {



	public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");


		//WebDriver driver = new ChromeDriver();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(options);


	//WebDriver driver=new ChromeDriver();
    //declaring globally implicit wait to tell selenium for wait 5 secs for ever scenario
     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//declaring webdriverwait class to invoke the method for explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));


	String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





	driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	Thread.sleep(3000);

	addItems(driver,itemsNeeded);

	driver.findElement(By.cssSelector("img[alt='Cart']")).click();

	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//explicit wait before typing promo code telling selenium to wait before applying code locator
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

	driver.findElement(By.cssSelector("button.promoBtn")).click();

	//explicit wait


	//explicit wait for waiting for text to display providing specific locator to display

	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());











	}

	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)

	{

	//Brocolli - 1 Kg

	//Brocolli,    1 kg

	String[] name=products.get(i).getText().split("-");

	String formattedName=name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;

	//click on Add to cart

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	if(j==itemsNeeded.length)

	{

	break;

	}

	}

	}

	}


}