package PACKAGES;


public class DEFAULT_ACCESS_SPECIFIER {

	//IT CAN BE ACCESED BOTH INSIDE THE CLASS AND WITHIN THE PACKAGE
	//IF WE DIDNT MENTION ANYTHING BEFORE A METHOD THEN IT IS "DEFAULT"
	//OR WE CAN DECLARE IT WITH DEFAULT KEYWORD
	
	static void  default1()
	{
		System.out.println("default method");
	}
	public static void main(String[] arg)
	{
		DEFAULT_ACCESS_SPECIFIER.default1();
	}
}

