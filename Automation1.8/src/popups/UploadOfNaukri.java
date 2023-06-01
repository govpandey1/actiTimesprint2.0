package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadOfNaukri {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=16201&err=1");
		driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]")).click();
		//"C:\Users\Govind Kumar Pandey\OneDrive\Desktop\Resume\Resume govind pandey-Account recievables.pdf"
		Pattern filename=new Pattern("C:\\Users\\Govind Kumar Pandey\\eclipse-workspace-java1.8\\Automation1.8\\TestData\\filename.png");
		Pattern openButton=new Pattern("C:\\Users\\Govind Kumar Pandey\\eclipse-workspace-java1.8\\Automation1.8\\TestData\\openButton.png");
		Screen screen=new Screen();
		screen.wait(filename,20);
		screen.type(filename,"C:\\Users\\Govind Kumar Pandey\\eclipse-workspace-java1.8\\Automation1.8\\TestData\\Resume govind pandey-Account recievables.pdf");
		screen.click(openButton);
		
		

	}

}
