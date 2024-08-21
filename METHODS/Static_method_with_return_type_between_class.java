
class Method3{
 
    static int add()
  {
   int a=10,b=10,c=a+b;
   return(c);

   }

}

public class Static_method_with_return_type_between_class{
    public static void main(String[] args)
    {   
       int d=Method3.add();
       System.out.println("adddition is "+d);


    }
    
}
