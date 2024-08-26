public class passby_reference {

    void sat(passby_reference s1)
    //we want to write class name in arguments list to specify tha as reference variabke
    //here we are passing value by using rferance variable
    {
        System.out.println(s1);

    }
    
    
    public static void main(String[] args) {
        
        passby_reference s2=new passby_reference();

        s2.sat(s2);

    }
    
}
