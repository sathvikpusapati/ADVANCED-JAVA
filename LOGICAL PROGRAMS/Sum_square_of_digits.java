public class Sum_square_of_digits {

        public static void main(String[] args) {

            int a=97895436;
            int sum_square=0;
         
         for(int rem=0;a!=0;a=a/10)
         {
            rem=a%10;
            sum_square=sum_square+(rem*rem);
    
    
         }
         System.out.println("sum square of  numbers is "+sum_square);
       
            
               
    
        }
        
    
    
    
}
