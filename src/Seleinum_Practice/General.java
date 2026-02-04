package Seleinum_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class General extends Global {
			
		public General(){
		super("chrome");
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		General Obj = new General();
		Obj.Flip();

	}
	
	public void screenshot()
	{
		TakesScreenshot TS = (TakesScreenshot)Driver;
		
		File sourFile = TS.getScreenshotAs(OutputType.FILE);
		
		File targFile = new File("\\C:\\Users\\Srikanth\\OneDrive\\Desktop\\Local\\Print.png");
		
	}
	
	public void Flip()
	{
		//Driver = new ChromeDriver();
		//Driver.get("https://www.flipkart.com/");
		Driver.findElement(loc).sendKeys("Nokia");
		Driver.findElement(loc).submit();
		try {
			
			Driver.findElement(loc1).click();
			
		} catch (Exception e) {
			
			System.out.println("Code executing");
		}
		
		//Driver.findElement(loc1).click();
	}

}
