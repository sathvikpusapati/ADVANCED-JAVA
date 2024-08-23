public class foe_each_loop {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,6,7,88,99,90};
        
        char b[]={'s','a','t','h','v','i','k'};

        String c[]={"sathvik","deepak","akshay","usha","hemanth"};

        System.out.print("string array c[]={");
        
        for (String strin : c) {
        
            System.out.print("\""+strin+"\""+",");

        }

        System.out.print("}");

        
       
        System.out.println(" ");
        System.out.print("integer array a[]={");
        
        for (int intee : a) {
        
            System.out.print(intee+",");

        }

        System.out.print("}");

        System.out.println(" ");
        System.out.print("character array b[]={");
        
        for (char charr : b) {
        
            System.out.print("'"+charr+"'"+",");

        }

        System.out.print("}");
 
 
    }
    
}
