package STRING_CLASS;

public class PRG_2 {
	
	public static void main(String[ ] a) {
		
		String s1="hello";
		String s2="hello";
		
		String s6=s1;//here i am trying to copy address of s1 to s6
		
		System.out.println("object adress is same "+(s1==s6));//false because i am not using new keyword when declaring string 
		System.out.println("object values are same "+s1.equals(s2));
		
		String s3=new String("hiii");
		String s4=new String("hiii");
		
		String s5=s3;
		
		System.out.println(s5==s3);
		System.out.println(s3.equals(s4));
	}

}
