package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		WebElement para=driver.findElement(By.xpath("//p[contains(text(),'You can also find a list')]"));
		String text=para.getText();
		if(text.contains("source") )
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.findElement(By.linkText("documentation")).click();
		//using contains
		//System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You can also find a list')]")));

	}

}
