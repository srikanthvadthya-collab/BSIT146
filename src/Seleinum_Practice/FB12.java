package Seleinum_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB12 {
	
	WebDriver driver;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		FB12 obj = new FB12();
		obj.LRU();
	
	}
	

	public void LRU() throws FileNotFoundException, IOException
	{
		driver=new ChromeDriver();
		Properties pr = new Properties();
	    pr.load(new FileReader(".\\FBdata.properties"));
	   // System.out.println(pr);
	    String website = pr.getProperty("url");
	    driver.get(website);
	    String un=pr.getProperty("username");
	    driver.findElement(By.name("email")).sendKeys(un);
	    String pw=pr.getProperty("password");
	    driver.findElement(By.name("pass")).sendKeys(pw);
		
	}
	
	
}
