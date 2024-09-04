package ENCAPSLATION;

class facebook
{
	private String psw="default";
	
	public String getpsw()
	{
		return psw;
	}
	
	public void setpsw(String psw)
	{
		this.psw=psw;
	}
}

class ENCAPSULATIO_PRG1
{
	public static void main(String[] m ) {
		
		facebook f=new facebook();
		
		System.out.println("current password : "+f.getpsw());
		//here i am not getting the private variable directly
		//i am indirectly calling the variable
		
		f.setpsw("ilkathamafilia");
		
		String k=f.getpsw();
		
		System.out.println("new password is : "+k);
		System.out.println("new password is : "+f.getpsw());
		
		
	}
}