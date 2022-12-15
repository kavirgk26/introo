package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Baseclass {
     public static WebDriver driver;
     
	public static void launchbrowser(String chrome) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavi\\eclipse-workspace\\pageobjectmodel\\driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		
		
		// TODO Auto-generated method stub

	}

}
