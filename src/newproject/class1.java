package newproject;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class class1 {



public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Documents\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();



//Firefox

//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

//WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

//WebDriver driver2 = new EdgeDriver();

driver.get("https://rahulshettyacademy.com");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

//driver.close();

//driver.quit();



}



}


