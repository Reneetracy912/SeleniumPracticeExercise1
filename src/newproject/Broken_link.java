package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URL;

import java.net.URLConnection;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;


public class Broken_link {
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
//chromeoptions class set the behavior of the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\reneetracy.vr\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//java methods to get urls and get the status code
		  //broken URL

        //Step 1 - IS to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken

        //a[href*="soapui"]'

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        

        

     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

     SoftAssert a =new SoftAssert();

    

     for(WebElement link : links)

     {

      

         String url= link.getAttribute("href");

        

         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

         conn.setRequestMethod("HEAD");

         conn.connect();

         int respCode = conn.getResponseCode();

         System.out.println(respCode);

         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

        

    

     }

    

     a.assertAll();
		

	}}

//     private static Object getReturnCode(WebElement link) {
//
//    	// TODO Auto-generated method stub
//
//    	return null;
//
//    	}
//
//
//
//    	}		
