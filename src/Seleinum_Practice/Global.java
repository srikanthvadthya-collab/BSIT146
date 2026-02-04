package Seleinum_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Global extends Utility{
	
	WebDriver Driver;

	public Global(String browser)
	{
		switch (browser) {
		case "chrome": 
			
		Driver = new ChromeDriver();
		break;
		
		case "firefox" :
			
			Driver = new FirefoxDriver();
			break;
			
					
		default:
			throw new IllegalArgumentException("Unexpected value: " + "browser");
		}
		
		Driver.get("https://www.amazon.com/");
	}
	
}
