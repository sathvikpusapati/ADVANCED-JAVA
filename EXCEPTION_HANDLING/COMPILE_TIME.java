package EXCEPTION_HANDLING;

import java.util.Scanner;

public class COMPILE_TIME {

	static void neet() throws register
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nenter your inter percentage :");
		
		double perc=sc.nextDouble(); sc.nextLine();
		
		System.out.println("\nenter caste oc/bc/sc/st : ");
		
		String caste=sc.nextLine();
		
		if(caste=="oc")
		{
			if(perc>=50.0)
			{
				System.out.println("you are eligible for the neet exam registration");
			}
			else
			{
				throw new register("\nnot eligible",1);
			}
		}
		else
		{
			if(perc>=40.0)
			{
				System.out.println("you are eligible for the neet exam registration");
			}
			else
			{
				throw new register("\nnot eligible",1);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		try{
			neet();
		}
		catch(register e)
		{
			e.details();
		}
		
		finally
		{
			System.out.println("\n\n\t\t\t\tthank you for visiting our page");
		}
	
	}
}

class register extends Exception
{	
	String msg;
	
	int attempts=0;
	
	register(String msg,int a)
	{
		this.msg=msg;
		attempts=attempts+a;
	}
	 
	 public void details()
	 {
		 System.out.println(msg);
		 System.out.println("\nyou have tried " +attempts+ " many times to register");
	 }
	 
}