package ENCAPSLATION;

class atm
{
	private int pin=1234;
	
	public int getpin()
	{
		return pin;
	}
	
	public void setpin(int a)
	{
		pin=a;
	}
}

public class ENCAPSULATION_PRG2 {
	
	public static void main(String[] args)
	{
		atm m=new atm();
		
		System.out.println("current pin : "+m.getpin());
		
		m.setpin(9911);
		
		System.out.println("new pin : "+m.getpin());
				
	}

	
}
