package selenium18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentId=driver.getWindowHandle();
		//click on link
	     driver.findElement(By.linkText("actiTIME Inc.")).click();
	     Set<String> allIds=driver.getWindowHandles();
	    	     for(String id:allIds)
	     {
	    	 
	    	 if(!id.equals(parentId))
	    	 {
	    		 driver.switchTo().window(id);
	    		 String TitleOfChild=driver.getTitle();
	    		 System.out.println(TitleOfChild);
	    	 }
	     }
	     driver.switchTo().window(parentId);
	     String titleofParent=driver.getTitle();
	     System.out.println(titleofParent);
		driver.quit();

	}

}
