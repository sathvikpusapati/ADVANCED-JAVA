package EXCEPTION_HANDLING;

public class NESTED_TRY_CATCH {
	
	public static void main(String[] m)
	{
		
		try 
		{
			try
			{
			int a=10/0;
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception handled");
			}
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
