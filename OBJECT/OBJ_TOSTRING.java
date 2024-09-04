package OBJECT;

class dd
{
	public String toString()
	{
		return "sathvik";
	}
}

class cd
{
	
}

public class OBJ_TOSTRING {
	
	public static void main(String[] a)
	{
		cd ob=new cd();
		
		dd obj=new dd();
		
		System.out.println("now i am displaying default tostring() method implicitly in class cd"+ob);
		
		System.out.println("now i am displaying default tostring() method explicitly in class cd"+ob.toString());
		
		System.out.println("now i am displaying customised tostring() method in class dd implicitly : "+obj);
		System.out.println("now i am displaying customised tostring() method in class dd explicitly : "+obj.toString());
		
		String string=obj.toString();
System.out.println("now i am displaying string variable implicitly "+string);
		
		System.out.println("now i am displaying string variable explicitly "+string.toString());
		
		
		
	}
}
