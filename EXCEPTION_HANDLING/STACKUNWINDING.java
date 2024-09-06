package EXCEPTION_HANDLING;

public class STACKUNWINDING {


	static void disp5()
	{
		int a=2/0;
	}
	static void disp4()
	{
		disp5();
	}
	static void disp3()
	{
		disp4();
	}
	static void disp2()
	{
		disp3();
	}
	 static void disp1()
	{
		disp2();
	}
	
	public static void main(String[]a)
	{
		try
		{
			
			
			disp1();
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();//we use this to trace where is the exception
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("thank you");
		}
	}
	
}
