package INTERFACE;

interface demo22
{
	//interface doesnt support constructor
	//interface doesnt support concrete method
	int x=20,y=10;//in interface any variable will be static and final by default
	void add();
	void sub();
}

abstract class sample22 implements demo22
{ //beacuse we dont have implemented interface methods 100%
	//we need to name this class as abstract
	public void add() 
	{
		System.out.println("addition is:"+(x+y));
	}
}

class sample23 extends sample22
{
	public void sub()
	{
		System.out.println("substraction is :"+(x-y));
	}
}


public interface INTERFACE_TO_CLASS {
	
	public static void main(String[]args)
	{
		sample23 ob23=new sample23();
		
		System.out.println("varaiables used are x="+ob23.x+", y=:"+ob23.y);
		System.out.println("varaiables used are x="+demo22.x+", y=:"+demo22.y);
		ob23.add();
		ob23.sub();
		
	}

}
