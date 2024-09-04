package STRING_CLASS;

public class STRING_FUNCTIONS2 {


	public static void main(String[] args)
	{
		String s10="sathvik@13$%^&raju";
		
		//if we use cap ^ we get those characters as output
		String[] name=s10.split("[^a-zA-Z]");
		
		//split only characters
		for(String ch : name)
		{
			System.out.print(ch);
		}
		
		System.out.println(" ");
		//split only  alphabets
		//if we use cap ^ we get those characters as output
				String[] name1=s10.split("[a-zA-Z]");
				
				//split only characters
				for(String ch : name1)
				{
					System.out.print(ch);
				}
				System.out.println(" ");
				
		//split only numbers
				
			String name3[]=s10.split("[^0-9]");
			
			for(String ch : name3)
			{
				System.out.print(ch);
			}
			
			System.out.println(" ");
			
			//split only special characters
			
			String name4[]=s10.split("[a-zA-Z0-9]");
			
			for(String ch : name4)
			{
				System.out.print(ch);
			}
	}
}
