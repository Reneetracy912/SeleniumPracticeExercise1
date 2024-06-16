package newproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class assignment2 {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

//WebDriver driver =new ChromeDriver();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.findElement(By.name("name")).sendKeys("Renee");
driver.findElement(By.name("email")).sendKeys("Renee4sing@gmail.com");
driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("renee123");
driver.findElement(By.id("exampleCheck1")).click();
WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
Select dropdown = new Select(staticDropdown);
dropdown.selectByIndex(1);
driver.findElement(By.id("inlineRadio2")).click();
driver.findElement(By.name("bday")).sendKeys("09/12/2000");
//driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.cssSelector(".btn-success")).click();
System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());




}
}