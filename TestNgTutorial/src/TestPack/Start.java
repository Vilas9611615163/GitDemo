package TestPack;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Start {
	@Parameters({"URL"})
	@Test
public void Test(String urlname)
{
	System.out.println("Vilas");
	System.out.println(urlname);
	
	}
	@Test(groups= {"Smoke"})
	public void Test2()
	{
		System.out.println("Likes");
		Assert.assertTrue(false);
	}
	@BeforeSuite
	public void BeSuite()
	{
		System.out.println("I will execute Initially");
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I will execute finally");
	}
	
}
