package COLLECTIONS;

import java.util.ArrayList;

public class ARRAY_LIST_PRG1 {

	public static void main(String[] a)
	{
		ArrayList li=new ArrayList<>();
		
		li.add(10);
		li.add("sathvik");
		li.add('y');
		li.add(2,"raju");//adding (int index ,object) and the index value should not exceed the present index value
		li.add(28.09);
		li.add(null);
		li.add(10);
		
		System.out.println(li);
		
		
	}
}
