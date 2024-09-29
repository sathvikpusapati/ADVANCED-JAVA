package COLLECTIONS;

import java.util.ArrayList;

public class CONTAINS_ALL_METHOD {


	public static void main(String[] a)
	{
		ArrayList li6=new ArrayList();
		
		li6.add("s22");
		li6.add("s22 plus");
		li6.add("s22 ultra");
		
		ArrayList li7=new ArrayList();
		
		li7.add("s22");
		li7.add("s22 plus");
		li7.add("s22 ultra");
		
		if(li6.containsAll(li7))
		{
			System.out.println("it is there");
		}
		
	}
}
