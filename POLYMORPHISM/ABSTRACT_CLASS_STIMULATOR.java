package ABSTRACTION;

abstract class demo13
{
	//abstract clas can contain both concrete methods and abstract methods
	
	abstract void add();
	abstract void sub();
	
	void mul()
	{
		
		System.out.println("multiplication");
	}
}

class implementation2 extends demo13 //since we have implemented all methods here we dclared this
									//class as normal class otherwise we need to declare this as abstract class
{
	void add()
	{
		System.out.println("addition ");
	}
	
	void sub()
	{
		System.out.println("substraction ");
	}
}

class stimulator extends implementation2
{
	static void stim(demo13 var)
	{
		var.add();
		var.sub();
		var.mul();
	}
}

public class ABSTRACT_CLASS_STIMULATOR {
	
	public static void main(String [] args)
	{
	   implementation2 reff=new implementation2();
	
	     stimulator.stim(reff);
	}
}