package TestPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Start2 {
	@Parameters({"URL"})

	@Test(groups= {"Smoke"})
	public void ploan(String urlwant) 
	{
		System.out.println("Cricket");
		System.out.println(urlwant);
	}
	@BeforeTest
	public void First()
	{
		System.out.println("I will execute first");
	}
	@AfterTest
	public void Last()
	{
		System.out.println("I will execute Last");
	}

}
