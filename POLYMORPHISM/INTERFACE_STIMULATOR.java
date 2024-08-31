package INTERFACE;


interface car
{
	void brand();
}

class toyota implements car
{
	public void brand()
	{
		System.out.println("toyota japanese brand");
	}
}

class tata extends toyota
{
	public void brand()
	{
		System.out.println("TATA indian brand");
	}
}

class volkswagen extends tata
{
	public void brand()
	{
		System.out.println("volkswagen german brand");
	}
}

class stimulator23 extends volkswagen
{
	static void main_car(car v12)
	{
		
		v12.brand();
	}
}
public interface INTERFACE_STIMULATOR {
	
	public static void main(String[] args)
	{
		toyota p=new toyota();
		tata p2=new tata();
		volkswagen p3=new volkswagen();
		
		stimulator23 m11=new stimulator23();
		
		stimulator23.main_car(p);
		stimulator23.main_car(p2);
		stimulator23.main_car(p3);
	}

}
