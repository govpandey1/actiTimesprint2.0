package selenium18;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c1=new ChromeDriver();
		Dimension dim=new Dimension(700,600);
		c1.manage().window().setSize(dim);
		
		

	}

}
