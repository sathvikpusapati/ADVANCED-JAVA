package CONSTRUCTOR_CHAINING;

class ab
{
	ab(String a , int b)
	{
		System.out.println(a+" "+b);
	}
}

class bc extends ab
{
	bc(int c)
	{
		super("sathvik",12);
		System.out.println(c);
	}
	
}

class cd extends bc
{
	cd(String c)
	{
		super(20);
		System.out.println(c);
	}
}


public class CONSTRUCTOR_chaining {

	
	public static void main(String[]m)
	{
		cd r=new cd("raju");
	}
}
