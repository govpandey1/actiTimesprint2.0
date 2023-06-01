package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		driver.findElement(By.xpath("//*[@id=\"fine-uploader-gallery\"]/div/div[3]/input")).sendKeys("C:\\Users\\Govind Kumar Pandey\\eclipse-workspace-java1.8\\Automation1.8\\TestData\\unnamed.png");

//it is only applica=cable for tag input
	}

}
