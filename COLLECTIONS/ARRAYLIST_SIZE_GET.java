package COLLECTIONS;

import java.util.ArrayList;

public class ARRAYLIST_SIZE_GET {

	public static void main(String[] args) {
		
		ArrayList li8=new ArrayList();
		
		li8.add(10);
		li8.add(50);
		li8.add(30);
		li8.add(20);
		
		System.out.println("i am printing specific element in array list using get :"+li8.get(2));
		
		int size=li8.size();
		
		System.out.println("\nsize of arraylist using size method :"+size+"\n");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(li8.get(i));
		}
	
	}

}
