
class Bool
{
   static void boole()
   {
    boolean a[]={true,false,false,false,true,true};
            
    System.out.print("boolean type array[]=");
    
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+",");
        
    }

   }
}

class Array_with_all_datatypes
{
    
    
        static void integerr()
        {  
            int a[]={1,2,4,5,6,7};
            
            System.out.print("integer type array[]=");
            
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+",");
                
            }
        }
        
         

        static void doublee()
        {  
            double a[]={1.2,2.0,4.3,5.3,6.4,7.5};
            
            System.out.print("double type array[]=");
            
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+",");
                
            }
        }
         static void charr()
          {  
             char a[]={'s','a','t','h','v','i','k'};
            
            System.out.print("character type array[]=");
            
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+",");
                
            }
          } 
          
          static void stringg()
          {  
             String a[]={"sathvik","hemanth","deepak","akshay"};
            
            System.out.print("string type array[]=");
            
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+",");
                
            }
          } 


        public static void main(String[] args) {
           
              integerr();
           
            System.out.println("");
            System.out.println("");


            doublee();
           
            System.out.println("");
            System.out.println("");

            charr();
           
            System.out.println("");
            System.out.println("");

            Bool.boole();
           
            System.out.println("");
            System.out.println("");







        }
    



















}