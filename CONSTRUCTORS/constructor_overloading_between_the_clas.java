class Overloadingg
{
    Overloadingg(int x)
    {
        System.out.println(x);
    
    }
    Overloadingg(int x , int y)
    {
        System.out.println(x+"   "+y);
        
    }


}

public class constructor_overloading_between_the_clas {

   
    public static void main(String[] args) 
    {

        
        
        Overloadingg abd = new  Overloadingg(5);

        Overloadingg bcd = new  Overloadingg(8,9);
    }
    
}
