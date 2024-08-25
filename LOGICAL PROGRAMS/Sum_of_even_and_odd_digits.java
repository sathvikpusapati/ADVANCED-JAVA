class sum{

    public static final int a[]={12,34,23,44,56,77,56};
  static void odd()
   {   
     int sum=0;
     
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2==1)
        {
            sum=sum+a[i];
        }


     }
     System.out.println("sum of odd numbers is "+sum);
   
    }

    static void even()
    {   
         
     int sum=0;
     
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2==0)
        {
            sum=sum+a[i];
        }


     }
     System.out.println("sum of even numbers is "+sum);
   

    }


}


public class Sum_of_even_and_odd_digits {

    public static void main(String[] args) {
        
           sum.even();
           sum.odd();

    }
    
}
