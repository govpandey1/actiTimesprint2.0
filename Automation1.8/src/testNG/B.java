package testNG;

import org.testng.annotations.Test;

public class B {
	@Test(priority=1)
	public void akas(){
		System.out.println("this is aksh demo file");
		
		
	}
	@Test(priority=-10,invocationCount=2)
	public void vikas() {
		System.out.println("this is demo file");
	}

}
