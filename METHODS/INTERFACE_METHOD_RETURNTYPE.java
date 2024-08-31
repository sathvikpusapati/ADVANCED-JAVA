package INTERFACE;

interface returns
{
	int add2(int x);
	
	double sub2(double x);
	
	float div2(int c);
	
}

class method_return implements returns
{
	public int add2(int x)
	{
		return 10+x;
		
	}
	public double sub2(double x)
	{
		return 99-x;
	}
	public float div2(int c)
	{
		return c/2;
	}
}
public interface INTERFACE_METHOD_RETURNTYPE {
	
	public static void main(String[] args)
	{
		method_return nn=new method_return();
		
		int x=nn.add2(79);
		double y=nn.sub2(45);
		float z=nn.div2(79);
		
		System.out.println("addition in this methid is "+x);
		System.out.println("substtraction is "+y);
		System.out.println("dividon is "+z);
		
	}

}
