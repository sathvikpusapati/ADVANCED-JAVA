class arm
{
    String armstrong(int a)
    {
        int n=a,temp=a,rem=0,sum=0;
        String c;

        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==temp)
        {
            c="it is a armstrong";

        }
        else
        {
            c="not a armstrong";
        }
        return(c);
    }
}

public class non_static_with_return {

    String pallindrome(int a)
    {
        int n=a,temp=a,rem=0,sum=0;
        String c;
        while(n>0)
        {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }

        if(sum==temp)
        {
            c="it is a pallindrome";

        }
        else
        {
            c="not a pallindrome";
        }
        return(c);
    }
        public static void main(String[] args) {
    
            non_static_with_return obj=new non_static_with_return();

            arm obj2=new arm();

            String d=obj.pallindrome(454);
            String e=obj2.armstrong(334);

            System.out.println(d);
            System.out.println(e);

            System.out.println("we can create an object bto call non static method\n or we can create using new keyword");

            String f=new non_static_with_return().pallindrome(454);
            String g = new arm().armstrong(334);

            System.out.println(f);
            System.out.println(g);

    
    
    
        }    


}
