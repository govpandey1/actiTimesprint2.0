package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/Govind%20Kumar%20Pandey/OneDrive/Desktop/html/Xpath.html");
WebElement k=driver.findElement(By.xpath("html/body/div[1]/input[1]"));//.sendKeys("govind");
//div[1]/input[1]
driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("relative xpath");

//by attribute


driver.findElement(By.xpath("//input[@value='d']")).sendKeys("By Attribute");

k.sendKeys("govind");

	}

}
