class Two_dimensional_array
{
    // a[i][j] i is for rows and j  is for coloums    
   // printing 10 tables using 2d array without extra variables other than for loop variables
   public static void main(String[] args) {
      
      int i,j;

      int a[][]= new int[10][10];
      
         

      for(i=0;i<a.length;i++) {
         
        
        for(j=0;j<a[i].length;j++) {
         
            a[i][j]=j+1;
        // in every coloumn 1 to 10 numbers stored
        
        }
  
        
        
      }
      for(i=0;i<a[i].length;i++) {
        // here we are using a[i].lenght to get row lenght
        

        for(j=0;j<a.length;j++) {
         
            System.out.println(a[i][i]+"x"+a[i][j]+"="+a[i][i]*a[i][j]);
            
            //here we are multiplying one set of array with another set
        
        }
         System.out.println("             ");
        
        
      }

      


   }









}