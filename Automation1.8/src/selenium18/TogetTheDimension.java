package selenium18;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTheDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver c1=new ChromeDriver();
Dimension dimension=c1.manage().window().getSize();
System.out.println(dimension);
int width=dimension.getWidth();
int height=dimension.getHeight();
System.out.println("width is    :"+width);

System.out.println("width is    :"+height);



	}

}
