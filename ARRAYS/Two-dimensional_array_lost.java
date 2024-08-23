class Two_dimensional_array_lost
{
   // printing 10 tables using 2d array without extra variables other than for loop variables in this i have failed
   public static void main(String[] args) {
      
      int i,j;

      int a[][]= new int[10][10];
      
         int c=1;

      for(i=0;i<a.length;i++) {
         
        
        for(j=0;j<a.length;j++) {
         
            a[i][j]=c;
        
        
        }
  
        c++;
        
      }
      for(i=0;i<a.length;i++) {
        
        int d=1;

        for(j=0;j<a.length;j++) {
         
            System.out.println(a[i][j]+"x"+d+"="+(a[i][j]*d));
            
            d++;
        
        }
         System.err.println("             ");
        
        
      }

      


   }









}