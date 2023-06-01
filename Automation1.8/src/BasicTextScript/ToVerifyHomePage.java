package BasicTextScript;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import testNG.BaseClass;

public class ToVerifyHomePage extends BaseClass {

	@Test
	public void verifyHOmePageTest() {
		// TODO Auto-generated method stub
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
//		LoginPage login=new LoginPage(driver);
//		login.loginAction("admin", "manager");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));

		String homePageTitle = driver.getTitle();
		Assert.assertTrue(homePageTitle.contains("Enter"));

//		HomePage homepage=new HomePage(driver);
//		homepage.logoutAction();

//		login.usernameTextField.sendKeys("trainee");
//		driver.navigate().refresh();
//		login.usernameTextField.sendKeys("admin");
		// login.passwordTextField.sendKeys("manager");
		// login.loginButton.click();
		// Thread.sleep(20);
		// driver.quit();

	}

}
