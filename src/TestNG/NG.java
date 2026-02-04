package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class NG {

	@Test
	public void method1()
	{
		System.out.println("This is method 1");
	}
	@Test
	public void method2()
	{
		System.out.println("This is method 2");
	}
	@Test
	@AfterMethod
	public void method3()
	{
		System.out.println("This is methid 3");
	}
	
	@BeforeClass
	public void method4()
	{
		System.out.println("This is method 4");
	}
	@AfterMethod
	@AfterClass
	public void method5()
	{
		System.out.println("This is method 5");		
	}
}
