package StringBuilder;

public class String_Builder {

public static void main(String[] args) {
		
		StringBuilder sw=new StringBuilder("rithvika\n");
		
		System.out.println(sw);
		
		StringBuilder sb=new StringBuilder("sai rithvika,");
		
		System.out.println("\nto convert stringbuilder to string we use .toString() "+sb.toString());
		
		//to know the capacity of Stringbuilder we use .capacity
		
		StringBuilder sb2=new StringBuilder("super deluxe");
		
		System.out.println("\n"+sb2);
		
		System.out.println("\nto know stringbuilder capacity we use .capacity() "+sb2.capacity());
		
		//to concatinate two strings we use append method
		
		System.out.println("\nto concatinate two strings we use append method "+sb.append(sb2));
		
		//equal method is used for address comparison 
		System.out.println("\n== method is used for address comparison "+(sw==sb));
		
		//compareTo method is used for data comparison 
		System.out.println("\ncompareTo method is used for data comparison "+sb.compareTo(sb2));
		
		//to reverse a string we use reverse()
		System.out.println("\nto reverse a string we use reverse()  "+sb2.reverse());
		sb2.reverse();
		
		System.out.println("\n"+sb2);
		//to delete a string we use delete()
		System.out.println("\nto delete characters we use delete(0,0)  "+sb2.delete(5,9));
		
		//to insert characters we use insert()
		System.out.println("\nto insert characters we use insert(0,String)  "+sb2.insert(6," delu" ));
	}

}
