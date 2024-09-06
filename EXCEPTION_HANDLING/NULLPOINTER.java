package EXCEPTION_HANDLING;

public class NULLPOINTER {

	public static void main(String[] m)
	{
		
		try 
		{
			
			String s=null;
			System.out.println(s.hashCode());
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("thank you buddy");
		}
	
	}
}
