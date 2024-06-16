package Selenium_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Point;


public class Basics_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reneetracy.vr\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		WebElement  position = driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint = position.getLocation();
		int xpoint = xypoint.getX();
		int ypoint = xypoint.getY();
		System.out.println("Xpoint is "+ xpoint+"Ypoint is "+ ypoint);
		WebElement  colorButton = driver.findElement(By.id("position"));
		
		String Buttoncolor = colorButton.getCssValue("background-color");
		System.out.println(Buttoncolor);
		WebElement  HWButton = driver.findElement(By.id("property"));
		int Height = HWButton.getSize().getHeight();
		int width = HWButton.getSize().getWidth();
		System.out.println(HWButton.getSize().getHeight());
		System.out.println(HWButton.getSize().getWidth());
		
		
		
		
		
		

	}

}
