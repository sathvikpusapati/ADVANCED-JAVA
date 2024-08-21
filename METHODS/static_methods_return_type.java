class static_methods_return_type{
    static int add()
    {   //static method 
       int a=10,b=10 ,c=a+b;
       return(c);   
    }

    public static void main(String[] args){

          int h=add();
           System.out.println("addition is "+h);


    }
    
}
