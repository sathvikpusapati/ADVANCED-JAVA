package EXCEPTION_HANDLING;

public class RUNTIME2 {

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
