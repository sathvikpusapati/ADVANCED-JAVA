 class sum_square_of_even_odd_digits{

    
  static int odd()
   {   
     int sum=0;
     int a=234567990;
     for(int rem=0;a!=0;a=a/10)
     {
        rem=a%10;

        

        if(rem%2==1)
        {
            sum=sum+(rem*rem);
        }

     }
     
        return(sum);
     }
     
   
    

    static int even()
    {
        int sum=0;
        int a=234567990;
        for(int rem=0;a!=0;a=a/10)
        {
            rem=a%10;

            if(rem%2==0)
            {
                sum=sum+(rem*rem);
            }

        }
    
         return(sum);

     }




public static void main(String[] args) {
        
          System.out.println("sumsquare of odd digits :"+odd());
          System.out.println("sumsquare of even digits :"+even());

    }
    

}
