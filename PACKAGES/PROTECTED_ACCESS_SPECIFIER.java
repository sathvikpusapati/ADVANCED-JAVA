package PACKAGES;

public class PROTECTED_ACCESS_SPECIFIER {

	public void add(int x , int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String [] args)
	{
		
		PROTECTED_ACCESS_SPECIFIER ob2=new PROTECTED_ACCESS_SPECIFIER();
		ob2.add(20, 30);
		
	}
}
