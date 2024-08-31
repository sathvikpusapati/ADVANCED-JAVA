package ABSTRACTION;

abstract class calc 
{
	abstract int add(int x,int y);
	abstract int sub(int x,int y);
	abstract int mult(int x,int y);
}

class calculation2 extends calc
{
	int add(int x,int y)
	{
		return x+y;
	}

	int sub(int x,int y)
	{
		return x-y;
	}

	int mult(int x,int y)
	{
		return x*y;
	}

}
public class ABSTRACT_METHOD_WITH_PARAMETERS_RETURNTYPE {

	public static void main(String[] args)
	{
		calculation2 ob3=new calculation2();
		
		System.out.println(ob3.add(20,10));
		System.out.println(ob3.sub(80,10));
		System.out.println(ob3.mult(10,10));
		
	}
}
