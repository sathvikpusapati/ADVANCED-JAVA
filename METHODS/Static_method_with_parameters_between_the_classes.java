
class Method2{
 
    static void add(int a,int b)
  {
   int c=a+b;
   System.out.println("addition is "+c);

   }

}

public class Static_method_with_parameters_between_the_classes {
    public static void main(String[] args)
    {   
        Method2.add(10,20);


    }
    
}
