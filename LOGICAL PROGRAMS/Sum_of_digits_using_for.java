public class Sum_of_digits_using_for{
    public static void main(String[] args) {
        
            int num=123; int res=0;

            for(int rem=0; num!=0;num=num/10)
            {
                rem=num%10;

                res=res+rem;



            }

                System.out.println(res);

    }
    
}

