package newproject;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class alerts{



public static void main(String[] args) {



String text="Rahul";

System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

//WebDriver driver = new ChromeDriver();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.findElement(By.id("name")).sendKeys(text);

driver.findElement(By.cssSelector("[id='alertbtn']")).click();

System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();

driver.findElement(By.id("confirmbtn")).click();

System.out.println(driver.switchTo().alert().getText());



driver.switchTo().alert().dismiss();



















   













}



       



       



     

       



       







}