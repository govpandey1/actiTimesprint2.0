package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.selenium.dev/");
/*By b=By.tagName("a");
WebElement e=driver.findElement(b);
e.click();*/
driver.findElement(By.linkText("Downloads")).click();
Thread.sleep(8000);

driver.quit();
	}

}
