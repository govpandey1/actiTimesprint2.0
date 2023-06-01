package selenium18;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToSubUrl {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser and after launching the browser it is automation rule to maximize 
		//it as some time we may miss few components of the website.
		ChromeDriver c1=new ChromeDriver();
		
		//navigate to url
		c1.get("https://www.selenium.dev/");
		
		//give SubURL
		Thread.sleep(10000);//used to give lagging time between to expresssions
		URL subUrl=new URL("https://www.oracle.com/in/");
		c1.navigate().to(subUrl);

	}

}
