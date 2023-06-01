package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E {
	@Test
	public void a() {
		
		System.out.println("Hi");
	}
	
	@Test(enabled=false)
	public void b() {
		Assert.fail();
		System.out.println("will u go for a date");
	}
	@Test
	public void c()
	{
		System.out.println("bye");
	}

}
