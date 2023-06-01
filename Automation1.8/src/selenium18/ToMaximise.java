package selenium18;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c1=new ChromeDriver();
		c1.manage().window().maximize();//to maximize the method
		Thread.sleep(10000);
		//minimize method is only available in selenium 4
		c1.manage().window().minimize();

	}

}
