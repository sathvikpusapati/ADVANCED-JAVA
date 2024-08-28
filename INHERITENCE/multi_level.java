class demo
{
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println("addition is :"+c);
    }
}
class demo1 extends demo
{
    void sub(int x,int y)
    {
        int c=x-y;
        System.out.println("substraction is :"+c);
    }
}
class demo2 extends demo1
{
    void mul(int x,int y)
    {
        int c=x*y;
        System.out.println("multipliion is :"+c);
    }
}

class calculator extends demo2
{
    void any()
    {
        System.out.println("yes");
    }
}
public class multi_level {

    public static void main(String[] args) 
    {
        
        calculator cc = new calculator();
    
                cc.add(10,20);
                cc.sub(20,10);
                cc.mul(10,9);
                cc.any();
    
    
    
    }
    
}
