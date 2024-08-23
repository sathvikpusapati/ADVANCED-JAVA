public class Count_odd_numbers_with_multiple_logical_expressions{

    public static void main(String[] args) {
        
        
            
            
        int a[] = {1,2,3,4,5,8,10,22,344};
            
        int count=0;
        
        for (int i=0; i<a.length; i++)
        {
             if(((a[i]%2== 1)&&(a[i]%2!=0))&&((a[i]%2>0)&&(a[i]%2<2)))
           { 
            count ++ ; 
        
        
           } 
        
        
        
        }
        
        System.out.println("number of odd elements in given array is "+ count);
          







    }
    
}
