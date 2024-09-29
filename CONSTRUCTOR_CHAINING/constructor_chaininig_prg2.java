package CONSTRUCTOR_CHAINING;

class demo
{
	demo()
	{
		System.out.println("hello");
	}
}

class demo2 extends demo
{
	
}


class sample extends demo2
{
	sample()
	{
		System.out.println("hello how are you");
	}
}
public class constructor_chaininig_prg2 {

	public static void main(String[] m)
	{
		new sample();
	}
}
