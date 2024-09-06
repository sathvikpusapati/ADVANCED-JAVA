package EXCEPTION_HANDLING;



public class RUNTIME_EXCEPTION {

		public static void main(String[] m)
		{
			
		
		int bb[]= {23,44,55};
	
	try 
	{
		
		System.out.println(bb[4]);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception handled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("exception handled");
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	catch(Throwable e)
	{
		System.out.println("exception handled");
	}
	finally
	{
		System.out.println("thank you buddy");
	}

	
	}

		
}