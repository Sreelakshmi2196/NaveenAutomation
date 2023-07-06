package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
WebDriver d;
	
	@BeforeMethod
	public void setup()
	{
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://naveenautomationlabs.com/opencart/");		
	}

}
