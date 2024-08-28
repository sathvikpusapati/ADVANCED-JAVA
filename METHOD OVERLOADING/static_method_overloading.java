class demo
{   
    
    static int add(int x)
    {
        int y;
        y=x+10;

        return y;
    }
    //variation in parameters
    static double add(int x,double y)
    {
        double z;
        z=x+y;

        return z;
    }
    //variation in occurance or order of parameters
    static double add(double y,int x)
    {
        double z;
        z=x+y;

        return z;  
    }
    
}
class static_method_overloading
{
    public static void main(String[] args) {
        
        System.out.println(demo.add(9));
        System.out.println(demo.add(9,10.9));
        System.out.println(demo.add(0.5,2));
    }
}