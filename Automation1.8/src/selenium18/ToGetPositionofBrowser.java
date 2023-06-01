package selenium18;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPositionofBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c1=new ChromeDriver();
	Point pos=	c1.manage().window().getPosition();
	System.out.println(pos);
	System.out.println("x cordinate is    :"+pos.getX());
	System.out.println("y cordinate is    :"+pos.getY());
		

	}

}
