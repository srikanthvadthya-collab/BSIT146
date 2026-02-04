package QAplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAbase {
	
	WebDriver driver;
	
	public QAbase() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	driver.get("https://qaplayground.dev/");
		
	}	
	
	public void close()
	{
		driver.quit();
	}
	

}
