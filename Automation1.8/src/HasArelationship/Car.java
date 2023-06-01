package HasArelationship;

public class Car {
	int price;
	String color;
	Engine e=new Engine(4,"diesel");
	CarCover c1=new CarCover();
	public Car()
	{}
	public Car(int price, String color)
	{
		this.price=price;
		this.color=color;
	}
	public Car(int price, String color,Engine e)
	{
		this(price,color);
		this.e=e;
	}
	public Car(int price, String color, Engine e,CarCover c1)
	{
		this(price,color,e);
		this.c1=c1;
	}

}
