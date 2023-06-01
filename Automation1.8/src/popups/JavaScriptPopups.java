package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopups {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(10);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage=alert.getText();
		alert.sendKeys("qspider");
		alert.accept();
		System.err.println(alertMessage);
		
		
	}
	

}
