package OBJECT;

class AB
{
	public boolean equals(Object a)
	{
		return false;
	}

}


public class OBJ_EQUAL {

	public static void main(String[] a)
	{
		AB obh=new AB();
		
		System.out.println(obh);
		
		AB obg=new AB();
		
		System.out.println(obg);
		System.out.println(obh.equals(obg));
		
		AB obh2=obh;
		
		System.out.println(obh.equals(obh2));
		
	}
}
