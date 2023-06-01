package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopups {

	public static void main(String[] args) {
		String username="admin";
		String pass="admin";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://"+username+":"+pass+"@the-internet.herokuapp.com/basic_auth");

	}

}
