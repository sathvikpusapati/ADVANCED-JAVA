
class odd{

    public static final int a[]={12,34,23,44,56,77,56};
  static void oddd()
   {   
     System.out.print("odd number array a[] :{");
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2==1)
        {
            System.out.print(a[i]+",");
        }


     }
     System.out.print("}\n");
   
    }

    static void even()
    {   
        System.out.print("even number array a[] :{");
    
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+",");
            }


        }
 
               System.out.print("}\n");


    }


}


public class printing_odd_even_num {

    
    
   
    public static void main(String[] args) {
        
        
        odd.oddd();

        odd.even();
       
    }
}
