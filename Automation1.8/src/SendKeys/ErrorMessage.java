package SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(3000);
		//String text=driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]")).getText();
       String text =driver.findElement(By.className("errormsg")).getText();
		System.out.println(text);
        String expected_text="Username or Password is invalid. Please try again.";
        if(text.contains(expected_text))
        {
        	System.out.println("passed");
        }
        else
        {
        	System.out.println("failed");
        }
        driver.quit();
        		
	}

}
