import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDepenedent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹61,999']
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		WebElement starlightIphone=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹61,999']"));
        String price=starlightIphone.getText();
        System.out.println(price);
        //we use dependent and idependent xpath when we have n numbers of same text available 
        //hence we connect it with the parent class 
        
	}

}
