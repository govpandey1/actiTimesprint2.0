package selenium18;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullScreen {

	public static void main(String[] args) {
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.skillrary.com/");
		//how to do full screen , 
		//difference between full screen and maximize is in maximize u  will see broswer and webpage both
		//however in full screen u will only get the webpage
		c1.manage().window().fullscreen();

	}

}
