package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBGlobal extends FBUtility{
	
	WebDriver driver;
	public FBGlobal(String browser) {
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Specified browswer not found");
			break;
		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
			}

}
