package newproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reneetracy.vr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        //WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
	
		
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//select class is a class used for accessing methods for static drop down
Select dropdown = new Select(staticDropdown);
//selecting drop down by index
dropdown.selectByIndex(3);
//getting the webelement name
System.out.println(dropdown.getFirstSelectedOption().getText());
//selecting drop down by visible text
dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
//dropdown by value(which is attribute)
dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());


}
}







