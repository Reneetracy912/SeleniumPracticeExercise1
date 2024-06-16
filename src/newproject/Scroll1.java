package newproject;

import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class Scroll1 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");

//limiting the scope to table

WebElement table=driver.findElement(By.id("product"));

//with table scope we are getting the count of tr tags speciffically for rows

System.out.println(table.findElements(By.tagName("tr")).size());

//within the  tr we are limiting the scope to 1st row to get the coloumn till tr.get(0) its for 1st row and again finding elemnets for coloumn

System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}