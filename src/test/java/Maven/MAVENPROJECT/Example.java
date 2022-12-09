package Maven.MAVENPROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
	
	@Test
	public void set()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\Telugu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
