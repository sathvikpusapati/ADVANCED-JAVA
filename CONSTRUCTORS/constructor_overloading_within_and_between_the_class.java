class construc
{
    construc(int x)
    {
        System.out.println("constructor overloading "+x);
    }
    construc(int x ,int y)
    {
        System.out.println("constructor overloading "+x+"  "+y);
    }
}

public class constructor_overloading_within_and_between_the_class {
   
    constructor_overloading_within_and_between_the_class(int x)
    {
        System.out.println(x);
    }
    constructor_overloading_within_and_between_the_class(int x ,int y)
    {
        System.out.println(x+"  "+y);
    }
    public static void main(String[] args) {
      
        constructor_overloading_within_and_between_the_class ob=new constructor_overloading_within_and_between_the_class(998);
        constructor_overloading_within_and_between_the_class obb= new constructor_overloading_within_and_between_the_class(98, 998);

        construc db=new construc(44);
        construc dd=new construc(44, 54);
    }
    
}
