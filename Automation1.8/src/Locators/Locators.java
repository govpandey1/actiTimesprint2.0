package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//by id 
		driver.findElement(By.className("navbar-logo"));
		
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		driver.quit();

	}

}
