class circle2{

   void area(int a)
   {
     double pi=3.14,res=pi*a*a;

     System.out.println("area of circle 2 is "+res);

   }


}


public class non_static_with_parameters {

    void circle1(int a)
    {
        
        double pi=3.14, res=pi*a*a;
        System.out.println("area of circle 1 is "+res);
    }

    public static void main(String[] args) {


        non_static_with_parameters obj = new non_static_with_parameters();

        circle2  obj2 = new circle2();

        obj.circle1(5);

        obj2.area(9);
        
        // we can create or call non static method in both ways 1) by creating object
        // 2) by using new keyword
        new circle2().area(6);
        new non_static_with_parameters().circle1(7);;

        



    }
    
}
