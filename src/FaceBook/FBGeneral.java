package FaceBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FBGeneral extends FBGlobal {


	

	public FBGeneral() {
		super("chrome");
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		FBGeneral obj = new FBGeneral();
		obj.F11();
		obj.F0();
		obj.F1();
		obj.F5();
		

	}
	
	
	public void F11() throws FileNotFoundException, IOException, InterruptedException
	{
		Properties PR = new Properties();
		PR.load(new FileReader(".//FBCred.properties"));
	//	System.out.println(PR);
		
		
		String UN = PR.getProperty("Email");
		String PW = PR.getProperty("Password");
		driver.findElement(email).sendKeys(UN);
		Thread.sleep(5000);
		driver.findElement(pass).sendKeys(PW);
		Thread.sleep(5000);
		
	}
	
	public void F0() throws FileNotFoundException, IOException
	{
			
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a")).click();
		driver.findElement(By.xpath("//input[@value='-1']/parent::*/parent::*")).click();
		driver.findElement(By.xpath("//input[@value='1']/parent::*")).click();
		driver.navigate().back();
		driver.findElement(CreateAccount).click();
		List<WebElement> ELE = driver.findElements(By.tagName("a"));
		System.out.println(ELE.size());
		for(WebElement name : ELE)
		{
			System.out.println(name.getText());
		}
		
		
	}
	public void F1()
	{
		driver.quit();
	}

	public void F5()
	{
		System.out.println("This is new change");
	}
	
	

	
}
