package HasArelationship;

public class CarDriver {

	public static void main(String[] args) {
		Car c1=new Car(98000,"black");
		System.out.println(c1.color);
		System.out.println(c1.price);
		System.out.println(c1.e.stroke);
		System.out.println(c1.e.type);
		System.out.println("--------------------------");
		Car c2=new Car(89000,"white",new Engine(4,"petrol"));
		System.out.println(c2.e.stroke);
		System.out.println(c2.e.type);
		System.out.println(c2.color);
		System.out.println(c2.price);
		System.out.println("----------------------------");
		CarCover cc=new CarCover("red",78);
		Car c3=new Car(900000,"blue",new Engine(6,"ev"),cc);
		System.out.println(cc.c_color);
		//c2=null;
		System.out.println(c2.e.stroke);
				
		System.out.println(c3.c1.c_color);

	}

}
