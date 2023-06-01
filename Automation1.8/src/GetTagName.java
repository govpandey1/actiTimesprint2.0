import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement selected = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		String tag = selected.getTagName();
		String tooltiptext = selected.getAttribute("title");
		System.out.println(("tooltip text is   :"+tooltiptext));
		if(tag.equals(tag))
		{
			System.out.println();
			selected.click();
		}
		else
			System.out.println("not proper tag name");
		
		Thread.sleep(4000);
		
		if(tooltiptext.contains("Do not select if this computer is shared"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("not passed");
		}
		driver.quit();

	}

}
