package ABSTRACTION;

abstract class bike
{
	abstract void yamaha(String a);
	abstract void yamaha(String a , String b);
	abstract void yamaha(String a , int speed);
}

class bikes extends bike
{
	String model;
	void yamaha(String a)
	{
		this.model=a;
		System.out.println(model);
	}
	void yamaha(String a,String b)
	{
		this.model=a; 
		String version=b;
		System.out.println(model+" "+version);
	}
	void yamaha(String a , int speed)
	{
		this.model=a;
		int sp=speed;
		System.out.println(model+" speed :"+sp);
	}

}

public class ABSTARCT_CLASSS_METHOD_OVERLOADING {
	
	public static void main(String [] m)
	{
		bikes obj22=new bikes();
		
		obj22.yamaha("rx 100");
		obj22.yamaha("R15","v3");
		obj22.yamaha("rx 150",180);
	}

}
