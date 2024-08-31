package ABSTRACTION;

abstract class construc
{
	construc(String sentence)
	{
		System.out.println(sentence);
	}
}

class myclass extends construc
{ 
	//here method overriding is happened 
   //that is only sub class will get implemented so we use super to implement super class

	myclass(String sentence) 
	{
		super(sentence);
		
	}
	
}

public class ABSTRACT_CLASS_CONSTRUCTOR {
	
	public static void main(String[]args)
	{
		myclass ob33=new myclass("we use super keyword and method over riding \n to use constructor in abstract class");
	}

}
