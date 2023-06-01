package BrowserControlling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Dimension dim=new Dimension(200,600);
		driver.manage().window().setSize(dim);
		Point pos=new Point(200,70);
		driver.manage().window().setPosition(pos);
		
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("height is :    "+size.getHeight());
		System.out.println("width is :    "+size.getWidth());
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());

	}

}
