import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement selected = driver.findElement(By.id("keepLoggedInCheckBox"));
		selected.click();
		boolean select=selected.isSelected();
		if(select)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

	}

}
