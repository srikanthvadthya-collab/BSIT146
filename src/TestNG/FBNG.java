package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBNG {

	WebDriver driver;
	
	@BeforeClass
	public void F2()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
@Test(priority = 1)
	public void F3() throws InterruptedException
	{
	//driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		
		//Thread.sleep(2000);
	}
@Test(priority = 2)
	public void F5()
	{
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("jsjsjs@gmail.com");
		Reporter.log("Entered data in email ");
		
	}
	
@AfterTest
	public void F4()
	{
		driver.quit();
	}
	
	
}

