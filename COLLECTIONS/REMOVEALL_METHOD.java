package COLLECTIONS;

import java.util.ArrayList;

public class REMOVEALL_METHOD {

	public static void main(String[]mm)
	{
		ArrayList li3=new ArrayList();
		
		li3.add(10);
		li3.add(20);
		li3.add(50);
		li3.add(60);
		li3.add(70);
		

		ArrayList li4=new ArrayList();
		
		li4.add(10);
		li4.add(20);
		li4.add(500);
		li4.add(600);
		li4.add(700);
		
		System.out.println(li3+"\n"+li4);
		
		li3.removeAll(li4);//it will remove duplicate items
		
		System.out.println(li3);
	}
}
