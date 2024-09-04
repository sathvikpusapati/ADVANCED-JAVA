package OBJECT;

class bd
{
	
}

class bd2
{
	public int hashCode()
	{
		return 1999;
	}
}

public class OBJ_HASHCODE {

	public static void main(String[] m)
	{
		bd aw=new bd();
		
		System.out.println("unique number of class bd is : "+aw.hashCode());
		
		bd2 awt=new bd2();
		
		System.out.println("customised unique number of class bd2 is : "+awt.hashCode());
		
		
		
	}
}
