package PACKAGES;


public class PRIVATE_ACCESS_SPECIFIER {
	
	  private void pass(String a)//ONLY WORKS WITHIN THE CLASS
	 {
		System.out.println("the pasword is : "+a);
	  }
	public static void main(String [] m)
	{
		PRIVATE_ACCESS_SPECIFIER pn=new PRIVATE_ACCESS_SPECIFIER();
		pn.pass("hello world");
		
	}
	
}
