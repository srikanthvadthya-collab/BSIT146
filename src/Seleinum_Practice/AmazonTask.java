package Seleinum_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	
	WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		AmazonTask Obj = new AmazonTask();
		Obj.Amazon();

	}
	
	public void Amazon() throws FileNotFoundException, IOException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Properties pr = new Properties();
		pr.load(new FileReader(".\\Amazon.properties"));
		//System.out.println(pr);
		String UN = pr.getProperty("username");
		String PW = pr.getProperty("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/div/header/div/div/div[3]/div/div[2]/a")).click();
		//this is for flipkart
		//driver.findElement(By.name("email")).sendKeys(UN);
	}

}
