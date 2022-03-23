package TestPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Start4 {
	

	@Test
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHome");
		System.out.println("WebLoginHouse");
		System.out.println("WebLoginHut");
		
	}
	@Test
	public void MobileLoginHomeLoan()
	{
		//appium
		System.out.println("MobLoginHome");
		System.out.println("MobLoginHouse");
		System.out.println("MobLoginHouse2");
		
	}
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}
	@BeforeClass
	public void Befclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void Afteclass()
	{
		System.out.println("After Class");
	}

}
