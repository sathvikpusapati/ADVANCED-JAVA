package FINAL;

final class secret //we cannot inherit final class
{
	final public void secret1()//we cannot override final method
	{
		System.out.println("the code for the secret vault is 1947");
	}
	final public void secret1(int newcode)
	{
		System.out.println("aftere resetting the code is : "+newcode);
	}
	
}

public class FINAL_CLASS {
	
	public static void main(String[] args)
	{
		secret sc=new secret();
		
		sc.secret1();
		sc.secret1(1996);
		
		final int a=0;
		//a=20;//we cannot reintialise a final variable
	}

}
