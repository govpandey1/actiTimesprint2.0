package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2Fcourses%2F3004%2FCore-Java%2Fsyllabus");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("govindregas@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Welcome@1");
		driver.findElement(By.name("btn_login")).click();

	}

}
