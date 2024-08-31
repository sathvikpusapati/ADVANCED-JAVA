package ABSTRACTION;

abstract class demo11
{
	//abstract clas can contain both concrete methods and abstract methods
	
	abstract void add();
	abstract void sub();
	int x;
	void mul(int x,int y)
	{
		this.x =x*y;//this is used when there are two same variable names
		System.out.println(x);
	}
}

class implementation extends demo11 //since we have implemented all methods here we dclared this
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

public class Abstract_class {
	
	public static void main(String [] args)
	{
		implementation abstra=new implementation();
		
		abstra.add();
		abstra.sub();
		abstra.mul(10,20);
		
	}

}
