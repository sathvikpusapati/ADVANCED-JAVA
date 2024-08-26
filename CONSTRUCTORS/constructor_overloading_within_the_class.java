
public class constructor_overloading_within_the_class  {

    
constructor_overloading_within_the_class(int x)
{
    System.out.println(x);

}
constructor_overloading_within_the_class(int x , int y)
{
    System.out.println(x+"   "+y);
    
}
    public static void main(String[] args) {
        
        constructor_overloading_within_the_class obj=new constructor_overloading_within_the_class(5);

        constructor_overloading_within_the_class obj1=new constructor_overloading_within_the_class(5,99);
    }
    
}
