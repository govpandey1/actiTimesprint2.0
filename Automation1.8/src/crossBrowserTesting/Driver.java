package crossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CrossBrowserTesting b1=new CrossBrowserTesting();
		b1.test(new ChromeDriver());
		System.out.println("testing done on chrome broser");
		Thread.sleep(4000);
		b1.test(new EdgeDriver());
		System.out.println("testing done on edge broser");

	}

}
