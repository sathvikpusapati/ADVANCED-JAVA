
class Method5{
 
    static int add(int a,int b)
  {
   int c=a+b;
   return(c);

   }

}

public class Static_method_with_return_type_and_parameters_between_class{
    public static void main(String[] args)
    {   
       int d=Method5.add(20,10);
       System.out.println("adddition is "+d);


    }
    
}
