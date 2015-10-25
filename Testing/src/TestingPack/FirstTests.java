package TestingPack;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class FirstTests {
	  @Rule
	  public ErrorCollector errCollect = new ErrorCollector();
	
	@Before
	public void BeforeTests()
	{
		//opening the browser code
		System.out.println("Opening the browser");
	}
	@Test
	public void sendTest()
	{
		try{
			System.out.println("from Class FirstTests");
			Assert.assertEquals(true, true);
		}
		catch (Throwable error)
		{
			errCollect.addError(error);
		}
	}
}
