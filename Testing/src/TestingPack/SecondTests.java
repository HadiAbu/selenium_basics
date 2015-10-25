package TestingPack;

import org.junit.After;
import org.junit.Test;

public class SecondTests {
	@Test
	public void sendTest()
	{
		System.out.println("from Class SecondTests");
	}
	@After
	public void AfterTests()
	{
		//Closing the browser code
		System.out.println("Closing the browser");
		
	}
}
