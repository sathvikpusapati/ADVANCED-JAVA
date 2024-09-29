package COLLECTIONS;

import java.util.ArrayList;

public class REMOVE_METHOD {

	public static void main(String[]a)
	{
	
		ArrayList li2=new ArrayList();
		
		li2.add("yamaha");
		li2.add("kawasaki");
		li2.add("ducati");
		
		System.out.println(li2);
		
		li2.remove("ducati");//we can object with its name
		
		System.out.println(li2);
		
		li2.remove(1);//we can remove object with index also
		
		System.out.println(li2);
		
		
		
		
	}
}
