public class Summation_of_even_odd_digits {
    
    static int even_sum()
    {
        int num=12567573; int res=0;

        for(int rem=0; num!=0;num=num/10)
        {
            rem=num%10;
            if(rem%2==0)
             res=res+rem;



        }

            return(res);


    }

    static int odd_sum()
    {
        int num=12567573; int res=0;

        for(int rem=0; num!=0;num=num/10)
        {
            rem=num%10;
            if(rem%2==1)
             res=res+rem;



        }

            return(res);


    }
    
    public static void main(String[] args) {
        
        int odd=odd_sum();
        int even=even_sum();
        System.out.println("sum of even digits : "+even+"\nsum of odd digits : "+odd);
        

}
}
