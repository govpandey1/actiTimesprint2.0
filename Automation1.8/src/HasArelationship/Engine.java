package HasArelationship;

public class Engine {
	int stroke;
	String type;
	public Engine()
	{
		System.out.println("constructor of the engine without any argument");
	}
	public Engine(int stroke)
	{
				this.stroke=stroke;
	}
	public Engine(int stroke,String type)
	{
		this(stroke);
		this.type=type;
	}
	public void start()
	{
		System.out.println("need engine to start a car");
	}

}
