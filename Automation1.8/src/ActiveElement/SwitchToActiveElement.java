package ActiveElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium");

	}

}
