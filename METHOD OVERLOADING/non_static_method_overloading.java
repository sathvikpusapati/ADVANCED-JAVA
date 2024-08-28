class demo2
{   
    int x;
    double y;

    int sub(int x)
    {
        this.x=x;
        return x;
    }
    double sub(int x , double y)//variation in parameters
    {
        this.x=x;
        this.y=y;
        return(x-y); 
    }
    double sub(double y,int x)//variation in order of parameters
    {
        this.x=x;
        this.y=y;
        return(x-y); 
    }
    



}
public class non_static_method_overloading {

    public static void main(String[] args) {
        
        demo2 a=new demo2();

        System.out.println(a.sub(20));
        System.out.println(a.sub(20,15.5));
        System.out.println(a.sub(14.5, 30));
    }
    
}
