package crossBrowserTesting;

import org.openqa.selenium.WebDriver;

public class CrossBrowserTesting {
	//public static void test(WebDriver driver ) {
	public  void test(WebDriver driver ) {
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		if(title.contains("Google")) {
			System.out.println("pass: title has been tested and testing is passed");
		}
		else
			System.out.println("failed");
		driver.quit();
		
		
	}

}
