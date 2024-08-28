class add
{
    int a=90,b=90;
   void addition()
    {
         
        System.out.println("addition is "+(a+b));
    }

    

}
class demo extends add
{
   void sub()
    {
       
    }

}

class single_level
{
    public static void main(String[] args)
     {
        
            
    
            demo ob=new demo();

            ob.addition();
            System.out.println(ob.a+" "+ob.b);
   
    }
}