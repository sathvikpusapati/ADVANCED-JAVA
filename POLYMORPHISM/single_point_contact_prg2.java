package POLYMORPHISM;

class bike1//super class
{
	void speed()
	{
		System.out.println("minimumm speed 100kmph");
	}
}
class cc150_ extends bike1 //sub class
{
	void speed()
	{
		System.out.println("minimumm speed 130kmph");
	}
}
class cc200_ extends cc150_ //sub class 2
{
	void speed()
	{
		System.out.println("minimumm speed 150kmph");
	}
}
class cc390_ extends cc200_ //sub class 3
{
	void speed()
	{
		System.out.println("minimumm speed 180kmph");
	}
}

/*v1 is a parameter of type bike. This means that when calling the speedometre method, 
you must pass an instance of bike or any of its subclasses (150cc, 200cc, 390cc, etc.).*/

class simulatorr// simulator class 
{	
	static void speedometre1(bike1 sp11 ,bike1 sp22,bike1 sp33)
	{
		sp11.speed();
		sp22.speed();
		sp33.speed();
	}
}


public class single_point_contact_prg2 {

	public static void main(String[] args)
	{
		cc150_ v11=new cc150_();
		cc200_ v22=new cc200_();
		cc390_ v33=new cc390_();
		
		simulatorr.speedometre1(v11,v22,v33);
		
		
		
	}
}