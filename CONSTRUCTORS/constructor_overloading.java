class overloading{

overloading(int x)
{
    System.out.println(x);

}
overloading(int x , int y)
{
    System.out.println(x+"   "+y);
    
}

}
public class constructor_overloading {

    public static void main(String[] args) {
        
        overloading obj=new overloading(5);

        overloading obj1=new overloading(5,99);
    }
    
}
