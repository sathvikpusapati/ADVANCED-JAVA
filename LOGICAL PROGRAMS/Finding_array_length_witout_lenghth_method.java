public class Finding_array_length_witout_lenghth_method{
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,6,7,88,99,90};

        int is=0,cs=0,ss=0;
        
        char b[]={'s','a','t','h','v','i','k'};

        String c[]={"sathvik","deepak","akshay","usha","hemanth"};
       
        System.out.println(" ");
        System.out.print("integer array a[]={");
        
        for (int intee : a) {
        
            System.out.print(intee+","); is=is+1;

        }

        System.out.print("} and size is "+is+"\n");

       
      

        System.out.println(" ");
        System.out.print("character array b[]={");
        
        for (char charr : b) {
        
            System.out.print("'"+charr+"'"+",");cs=cs+1;

        }

        System.out.print("} and size is "+cs+"\n\n");
       
       
        System.out.print("string array c[]={");
        
        for (String strin : c) {
        
            System.out.print("\""+strin+"\""+",");ss=ss+1;

        }

        System.out.print("} and size is "+ss+"\n\n");

        
       
      
        
 
 
    }
    
}
