package PACKAGES;

public class PUBLIC_ACCESS_SPECIFIER {
//can be used within the class ,within the package
//when we are using outside the package we need to use extends keyword
	//IS a relationship is needed to implement protected method outsidde package
	
	public  void methh()
	{
		System.out.println("public method");
	}
	public static void main(String[]a)
	{
		PUBLIC_ACCESS_SPECIFIER obh=new PUBLIC_ACCESS_SPECIFIER();
		obh.methh();
	}

}
