package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//creating variable 
		WebElement move1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//build and perform helps to perform actions
		a.moveToElement(move).build().perform();
		//click and sending capital keys and also copying the keys to double click
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//right click on the CTA-use--->contextClick
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
}
}
