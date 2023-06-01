package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		if(title.contains("Google"))
		{
			System.out.println("passed");
		}
		else
			System.out.println("failed");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.gmail.com");
		String url=driver.getCurrentUrl();
		if(url.contains("gmail"))
		{
			System.out.println("passed");
		}
		else
			System.out.println("failed");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
