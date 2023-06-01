package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class toverifyGoogleinchromeandedge {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void toVerifyGoogle(String browser) {
		
	
	if(browser.equals("Chrome")) {
		
		 driver=new ChromeDriver();
	}
	if(browser.equals("Edge"))
	{
		
		 driver=new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver, "Google");
//		if(driver.getTitle().contains("Google"))
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}

	}}
