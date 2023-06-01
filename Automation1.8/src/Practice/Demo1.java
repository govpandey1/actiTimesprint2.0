package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
public static void main(String[] args) throws InterruptedException
 {

//open the browser
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	
	//to wait for 4 sec 
	Thread.sleep(4000);
	//get the position and size of the window
	System.out.println(driver.manage().window().getPosition());
	System.out.println(driver.manage().window().getSize());
	//resize the browser
	Dimension d=new Dimension(200,200);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	
	
	//move the browser
	Point p=new Point(300,200);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	driver.quit();

}
}
