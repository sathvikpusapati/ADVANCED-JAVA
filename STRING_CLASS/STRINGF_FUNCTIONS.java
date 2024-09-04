package STRING_CLASS;

public class STRINGF_FUNCTIONS {

	public static void main(String[]a)
	{
		String s="sathvik";
		
		//.length() function
		System.out.println("length of the string "+s.length());
		
		//.charAt() function\
		System.out.println("\ncharacter of string at index 2 is "+s.charAt(2)+"\n");
		
		//printing each character separately in the string 
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//indexof(character) function

		System.out.println("\nindex of the character t :"+s.indexOf('t')+"\n");
		
		//substring(starting index ,ending index) function
		
		System.out.println("\nprinting substring "+s.substring(1,5));
		
		//substring with only starting index
		
		System.out.println("\nprinting substring with single index "+s.substring(2,s.length()));
		
		//substring function within only one index
		
		System.out.println("\nsubstring with only one index"+s.substring(5));
		
		//sbSequence function
		
		System.out.println("\n subsquence of stirng "+s.subSequence(2,6));
		
		//subSequence only work with two indexes
		
		//tolower and toupper functions
		
		System.out.println("\nconverting string to lowercase "+s.toLowerCase());
		
		System.out.println("\nconverting string to uppercase "+s.toUpperCase());
		
		//satrtswith and endswith functions
		//to check the starting points and ending points are same or not
		//we get result true or false
		System.out.println("\n "+s.startsWith("sa"));
		
		System.out.println("\n "+s.endsWith("ik"));
		
		//contains function to check string contains specified characters 
		//results will be T/F
		
		System.out.println("\n "+s.contains("sa"));
		
		//concat function to add characters to string
		
		System.out.println("\n "+s.concat(" Raju"));
		
		//using equals method to compare two strings with case sensitive
		
		String as="apple",bs="Apple";
		
		System.out.println("\n "+as.equals(bs));
		
		//using equalsIgnorecase method to compare two strings without case sensitive
		
		System.out.println("\n "+as.equals(bs));
		
		System.out.println("\t\t\t\t\t SPLIT METHODS\n\n ");
		
		//SPLIT MeETHODS
		
		//splitting using ","
		String str= "bike,car,boat,sub";
		
		String fruits[]=str.split(",");//it is a string type array
		
		
		for(String fruitss :fruits)
		{
			System.out.println(fruitss);
		}
		
		System.out.println("\n");
		
		//splitting using "," with limit
				String str22= "bike,car,boat,sub";
				
				String fruits22[]=str22.split(",",2);//it is a string type array
				
				
				for(String fruitss :fruits22)
				{
					System.out.println(fruitss);
				}
				
				System.out.println("\n");
				
		//splitting using "\\." removing dots and splittting
		String str2="bike.car.mam.boy";
		
		String objects[]=str2.split("\\.");
		
		for(String strr : objects)//printing one by one in string array
		{
			System.out.println(strr);
		}
		System.out.println("\n");
		//splitting using "\\s+" blank spaces
		
		String str3="sathvik is a good boy";
		
		String things[]=str3.split("\\s+");
		
		for(String tt : things)
		{
			System.out.println(tt);
		}
		
		System.out.println("\n");
		//splitting using "\\s+" and "," blank spaces
		// removing blank spaces and delimetre
		
				String str4="samsung smartphones , are the best";
				
				String things2[]=str4.split("[\\s,]");
				
				for(String tt2 : things2)
				{
					System.out.println(tt2);
				}
		
				System.out.println("\n");
				
				//splitting with special characters
				String str5="a +b -c*d/ ";
				
				String split3[]=str5.split("[\\+\\-\\*\\/]");
				
				for(String tt2 : split3)
				{
					System.out.println(tt2);
				}
				
				System.out.println();
				
				
		
	
	
	}
}
