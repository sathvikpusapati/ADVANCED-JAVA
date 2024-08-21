 class Method1{
  //static method between the classes
  static void add()
{
   int a=10,b=10,c=a+b;
   System.out.println("addition is "+c);

}

}

class Method2{
  //static method with parameters between the classes
    static void add(int a,int b)
  {
     int c=a+b;
     System.out.println("addition is "+c);
  
  }
  
}

class Method3{
  //static method with return type between the classes
    static int add( )
  {
     int a=10,b=20,c=a+b;
     return(c);
  
  }
}

class Method4{
  //static method with both parameters and return type between the classes
    static int sub(int a,int b)
  {
     int c=a-b;
     return(c);
  
  }
}

public class Methods{

    static void add()
    {   //static method 
       int a=10,b=10,c=a+b;
       System.out.println("addition is "+c);
    
    }

    static void add(int a, int b)
    {  //static method with parameters
       int c=a+b;
       System.out.println("addition is "+c);
    
    }
    
    static int add3()
    {  //static method with return type
       int a=10,b=10,c=a+b;
        return(c);
    
    }

    static int add4(int a,int b)
    {  //static metod with both parameters and return type
       int c=a+b;
        return(c);
    
    }
    
    //following is the main method
    public static void main(String[] args)
    {   // following four methods are static methos bwtween the classes
        Method1.add();
        Method2.add(10,20);
        System.out.println("addition is  "+(Method3.add()) );
        System.out.println("substraction is  "+(Method4.sub(40,30)) );
        
        //following four methods are static methods within a single class

          add();
          add(10,20);
           /*here both the method names are same but 
          the second method contains parameters in java due to polymorphism it is acceptable */
          System.out.println("addition is  "+(add3()) );
          System.out.println("addition is  "+(add4(40,30)) );

    }
    
}
