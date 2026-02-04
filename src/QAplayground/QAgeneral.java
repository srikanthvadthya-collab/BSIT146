package QAplayground;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QAgeneral extends QAbase {
	
	
	/*public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
				
		QAgeneral obj =new QAgeneral();
		obj.QAplay();
		obj.close();
		

	}*/
	@Test(priority = 1)
	public void QAplay() throws FileNotFoundException, IOException, InterruptedException
	{
		//load read useit
		
		Properties pr = new Properties();
		pr.load(new FileReader(".\\QAdata.properties"));
		//System.out.println(pr);
	//	String brows = pr.getProperty("Browser");
		String url = pr.getProperty("Website");
		driver.get(url);
		driver.findElement(By.xpath("//html/body/main/div[3]/a[3]/div")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Remove All')]")).click();
		WebElement cross= driver.findElement(By.xpath("//input[@type='text']"));
		cross.sendKeys("java");
		cross.click();
		driver.navigate().back();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//h3[contains(text(),'Pop-Up Window')]")).click();
		driver.findElement(By.id("login")).click();
		driver.navigate().back();
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		System.out.println(atag.size());
		for(WebElement list :atag)
		{
			System.out.println(list.getText());
		}
		
		List<WebElement> title= driver.findElements(By.tagName("title"));
		System.out.println(title.size());
		
		for(WebElement t1:title)
		{
			System.out.println(t1.getText());
		}
		
		List<WebElement> inp= driver.findElements(By.tagName("input"));
		System.out.println(inp.size());
		
		//driver.findElement(By.xpath("//input[@type='text']")).click();
	}
	
	@Test(priority = 2)
	public void t5()
	{
		driver.findElement(By.xpath("//h3[contains(text(),'Pop-Up Window')]")).click();
	}
	

}
