package testNG;

import org.testng.annotations.Test;

public class Invocation_count {
	@Test(invocationCount=10)
	void test()
	{
	System.out.println("testing...");	
	}
}
