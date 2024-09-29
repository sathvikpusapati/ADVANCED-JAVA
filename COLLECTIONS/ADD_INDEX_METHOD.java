package COLLECTIONS;

import java.util.ArrayList;

public class ADD_INDEX_METHOD {

	public static void main(String[]mm)
	{
		ArrayList li3=new ArrayList();
		
		li3.add(10);
		li3.add(20);
		li3.add(50);
		li3.add(60);
		li3.add(70);
		

		ArrayList li4=new ArrayList();
		
		li4.add("yes");
		li4.add(2450);
		li4.add(590);
		li4.add(680);
		li4.add(704);
		
		System.out.println(li3+"\n"+li4);
		
		li3.add(2,li4);//it will print the other collection at this index
		
		System.out.println(li3);
	}

}
