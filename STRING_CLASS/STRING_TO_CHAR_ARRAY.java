package STRING_CLASS;

public class STRING_TO_CHAR_ARRAY {

	public static void main(String[] a)
	{
		String s1="sathvik raju";
		
		char s2[]=s1.toCharArray();
		
		
		for(char s3 : s2)
		{
			
			System.out.println(s3);
		}
	}
}
