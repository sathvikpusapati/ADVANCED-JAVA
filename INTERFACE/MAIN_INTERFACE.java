package INTERFACE;

interface car1
{
	void brand();
}

class toyota1 implements car1
{
	public void brand()
	{
		System.out.println("toyota japanese brand");
	}
}

class tata1 implements car1
{
	public void brand()
	{
		System.out.println("TATA indian brand");
	}
}

class volkswagen1 implements car1
{
	public void brand()
	{
		System.out.println("volkswagen german brand");
	}
}
public interface MAIN_INTERFACE {
	
	public static void main(String [] args)
	{
		car1 m1=new toyota1();
		car1 m2=new tata1();
		car1 m3=new volkswagen1();
		
		m1.brand();
		m2.brand();
		m3.brand();
	}

}
