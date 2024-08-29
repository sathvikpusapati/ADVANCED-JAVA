package POLYMORPHISM;

class bike//super class
{
	void speed()
	{
		System.out.println("minimumm speed 100kmph");
	}
}
class cc150 extends bike //sub class
{
	void speed()
	{
		System.out.println("minimumm speed 130kmph");
	}
}
class cc200 extends cc150 //sub class 2
{
	void speed()
	{
		System.out.println("minimumm speed 150kmph");
	}
}
class cc390 extends cc200 //sub class 3
{
	void speed()
	{
		System.out.println("minimumm speed 180kmph");
	}
}

/*v1 is a parameter of type bike. This means that when calling the speedometre method, 
you must pass an instance of bike or any of its subclasses (150cc, 200cc, 390cc, etc.).*/

class stimulator// simulator class 
{	
	static void speedometre(bike v1)
	{
		v1.speed();
	}
}


public class single_point_contact{

	public static void main(String[] args)
	{
		cc150 sp1=new cc150();
		cc200 sp2=new cc200();
		cc390 sp3=new cc390();
		
		stimulator.speedometre(sp1);
		stimulator.speedometre(sp2);
		stimulator.speedometre(sp3);
		
		
	}
}
