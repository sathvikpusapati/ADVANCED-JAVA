package STRING_CLASS;

public class STRING_REVERSE {

	public static void main(String[] args)
	{	
		String s3=new String("sathvik how old are you");
	
		char[] s4=s3.toCharArray();
		
		for(char ch : s4)
		{
			System.out.print(ch+" ");
		}
	
		System.out.println("\n\n");
	
		for(int i=s3.length()-1;i>=0;i--)
		{
			System.out.print(s3.charAt(i)+" ");
		}
	
	
	}
	
}
