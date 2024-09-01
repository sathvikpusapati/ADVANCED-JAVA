package METHOD_OVERRIDING;

// pure method overriding without  upcasting
class animal
{

    void sounds()
    {
        System.out.println("sound");
    }
}

class dog extends animal
{
    void sounds()
    {
        System.out.println("barks");
    }
}

class cat extends animal
{
    void sounds()
    {
        System.out.println("meoww");
    }
}


public class METHOD_OVER_RIDING_2 {

	public static void mian(String [] a)
	{
		animal ani=new animal();
		
		dog dg=new dog();
		
		cat cct=new cat();
		
		ani.sounds();
		dg.sounds();
		cct.sounds();
	}
}
