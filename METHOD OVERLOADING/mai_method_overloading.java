public class mai_method_overloading {

    public static void main(String args) {
        
        System.out.println(args);
    
    
    }

    public static void main(String args , String args2) {
        
        System.out.println(args+"   "+args2);
    
    
    }

    public static void main(String args ,int args2) {
        
    
        System.out.println(args+ " "+args2);

    
    }
    public static void main(int args ,String args2) {
        
        System.out.println(args+" "+args2);
    
    }

    public static void main(String[] args) {

        main("sathvik");
        main("sathvik","raju");
        main(100,"rajaaa");
        main("raja",1000);
        
    }

}
