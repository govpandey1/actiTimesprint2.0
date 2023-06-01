package testNG;

import org.testng.annotations.Test;

public class G {
	@Test(groups="regression",priority=4)
	public void sentmail() {
		System.out.println("user has sentmail");
	}
	
	@Test(groups="smoke",priority=5)
	public void logout() {
		System.out.println("user has logout");
	}



}
