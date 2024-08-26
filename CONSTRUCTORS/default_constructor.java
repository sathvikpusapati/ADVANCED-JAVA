public class default_constructor {

    int a=10;
    String s="sathvik";
    
    default_constructor()
    {

    }
    public static void main(String[] args)
    {
            default_constructor obj=new default_constructor();
            // i just created an object but the declaration will done automatically
            //because it is a constructor

            System.out.println(obj.a+"  "+obj.s);

    }
}
