class laila
{
    int x=20;
    laila()
    {
        int y=90;
        System.out.println("raja");

        int z=90,x=y+z;

        System.out.println(x);
        
    }


}

public class construcor_without_parameters {

    public static void main(String[] args) {
        
        laila bj=new laila();

        System.out.println(bj.x); // only variables declared in the class will work


    }
    
}
