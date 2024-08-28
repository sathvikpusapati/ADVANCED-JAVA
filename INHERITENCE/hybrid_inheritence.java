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

class calculator extends demo2 //inheriting from sub class
{
    void any()
    {
        System.out.println("yes");
    }
}

class div extends demo //inheriting from parent class
{
    void divison(int x,int y)
    {
        int d=x/y;
        System.out.println("divison is "+d);
    }
}

public class hybrid_inheritence {

    public static void main(String[] args) {
        

        calculator ob=new calculator();
        ob.add(10, 20);
        ob.sub(20,19);
        ob.mul(4,5);

        div obj=new div();

        obj.add(10,80);
        obj.divison(20, 10);


    }

    
}
