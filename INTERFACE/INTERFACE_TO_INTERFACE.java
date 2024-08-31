package INTERFACE;

interface class1
{
	String city="nellore";
	void name();
}
interface class2 extends class1
{
	void age();
}
abstract class interface_class implements class2//didnt implemented all abstract methods so defined as "abstract class" 
{
	public void name()
	{
		System.out.println("sathvik");
	}
}

class interface_class2 extends interface_class
{
	public void age()
	{
		System.out.println("24");
	}
}
public interface INTERFACE_TO_INTERFACE {
	
	public static void main(String[] args)
	{
		interface_class2 obj23=new interface_class2();
		obj23.name();
		obj23.age();
		System.out.println(class1.city);//as city is static
		//System.out.println(obj23.city);
	}

}
