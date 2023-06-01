package SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cntlc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		userName.sendKeys("trainee");
		userName.sendKeys(Keys.CONTROL,"a");
		userName.sendKeys(Keys.CONTROL,"c");
		pass.sendKeys(Keys.CONTROL,"v");
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		driver.quit();

	}

}
