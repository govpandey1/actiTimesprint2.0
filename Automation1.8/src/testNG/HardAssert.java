package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo()
	{
		String a="abc";
		String b="abcd";
		Assert.assertEquals(a, b);
		System.out.println("pass");
	}
	

}
