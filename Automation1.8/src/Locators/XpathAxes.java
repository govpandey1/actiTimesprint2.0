package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("govind");
		driver.findElement(By.xpath("//*[@id=\"reg_form_box\"]/child::div[1]/descendant::*/input")).sendKeys("govind");//child and descendent use of the xpathaxes
		driver.findElement(By.xpath("//*[@id=\"u_0_g_6b\"]/ancestor::div[@id=\"reg_form_box\"]/child::div[1]/descendant::*/input")).sendKeys("raj");
		
		driver.findElement(By.xpath("//div[@id=\"reg_form_box\"]/child::div[11]/child::*")).click();
        Thread.sleep(5000);
		driver.close();
	}

}
