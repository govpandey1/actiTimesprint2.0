package SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//SendKeys() is the method of web element interface
		//SendKeys(), can pass string and keyboard simulation
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		userName.sendKeys("admin");
		pass.sendKeys("manager");
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		driver.quit();
		
		

	}

}
