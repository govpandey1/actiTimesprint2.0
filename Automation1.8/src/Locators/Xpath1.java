package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//*[@id=\"Layer_1\"]"));//relative xpth
		driver.findElement(By.xpath("//*[@id=\"Layer_1\" or data-name=\"Layer 1\"]"));//by using or operator
		

	}

}
