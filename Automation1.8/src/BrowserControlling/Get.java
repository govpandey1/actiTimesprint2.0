package BrowserControlling;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("height is :    "+size.getHeight());
		System.out.println("width is :    "+size.getWidth());
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		URL suburl=new URL("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.navigate().to(suburl);
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		driver.quit();
		

	}

}
