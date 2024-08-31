package ABSTRACTION;

abstract class animal
{
	//abstract clas can contain both concrete methods and abstract methods
	
	abstract void dog();
	abstract void cat();
	
	
}

abstract class animal2 extends animal//abstract class can contain concrete method too
{
	void snake()
	{
		System.out.println("bussssss");
	}
}


abstract class implement extends animal2 //since we didnt implemented all the abstract 
										 //methods here we converted this class to abstract
{
	void dog()
	{
		System.out.println("bowwwwww ");
	}
	
	/*void cat()
	{
		System.out.println("meow");
	}*/
}

class myanimal extends implement
{
	void cat()
	{
		System.out.println("meowwww");
	}
}


public class Abstract_2 {
	
	public static void main(String [] args)
	{
		myanimal ob12=new myanimal();
		ob12.dog();
		ob12.cat();
		ob12.snake();
	}
	
	

}
