package TestPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Start3 {

	@Test(dataProvider="getData")
	public void WebLoginCarLoan(String urlname, String Key)
	{
		//selenium
		System.out.println("WebLogin");
		System.out.println(urlname);
		System.out.println(Key);
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginCarLoan(String urlneeed)
	{
		//appium
		System.out.println("MobLogin");
		System.out.println(urlneeed);
	}
	@BeforeMethod
	public void BFM()
	{
		System.out.println("I will exrcute before methods of Start3");
	}
	@Test(dependsOnMethods= {"MobileLoginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("APILogin");
	}
	@AfterMethod
	public void AFM()
	{
		System.out.println("I will exrcute After methods of Start3");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="Firstusername";
		data[0][1]="FirstPassword";
		//2nd set
		data[1][0]="Secondusername";
		data[1][1]="SecondPassword";
		//3rd set
		data[2][0]="Thirdusername";
		data[2][1]="ThirdPassword";
		return data;
		
	}
}
