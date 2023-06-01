package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToverifyFacebook {
	@Test
	public void toVerifyFacebook() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		if(driver.getTitle().contains("Facebook"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
