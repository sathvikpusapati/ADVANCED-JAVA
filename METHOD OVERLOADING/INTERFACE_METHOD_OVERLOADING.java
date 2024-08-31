package INTERFACE;

interface maths
{
	void calcu(int x, int y);
	void calcu(int x, long y);
	void calcu(int x, short y);
	
}
class implements2 implements maths
{
	public void calcu(int x, int y)
	{
		System.out.println("addition is:"+(x+y));
	}
	public void calcu(int x, long y)
	{
		System.out.println("substractiom is:"+(x-y));
	}
	public void calcu(int x, short y)
	{
		System.out.println("multplication is:"+(x*y));
	}
	
}
public interface INTERFACE_METHOD_OVERLOADING {
	
	public static void main(String [] args)
	{
		implements2 obn=new implements2();
		
		obn.calcu(20, 30);
		obn.calcu(50, 60);
		obn.calcu(10, 2);
		
	}

}
