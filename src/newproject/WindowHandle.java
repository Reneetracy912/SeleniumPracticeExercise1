package newproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		// WebDriver driver =new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/"); 
		driver.findElement(By.cssSelector(".blinkingText")).click();
//inorder to change the window to another window  we should use getWindowHandles to get the id of the windows
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		//we got ID and we are storing that in set by [ parentWindowId,ChildWWindowId] and iterating throught the terator method to get the exact window of the mail id to grab
		Iterator<String>it = windows.iterator();
//Initially the iterator will be outside, you need to point it to the first index by next method and for upcoming child window, give again nxt
		String parentId = it.next();

		String childId = it.next();
//now child ID will points to child window'id
		driver.switchTo().window(childId);
//Get the mail id text from the child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();
//trim method used to remove whitespace, front and back of the word or sentance
		
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);


		

}
}