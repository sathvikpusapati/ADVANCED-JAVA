package EXCEPTION_HANDLING;

public class RUNTIME {

	public static void main(String[] m)
	{
		
		try 
		{
			
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("thank you buddy");
		}
	
	}
	
	
}
