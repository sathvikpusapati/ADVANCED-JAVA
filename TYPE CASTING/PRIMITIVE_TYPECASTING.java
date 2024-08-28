class PRIMITIVE_TYPECASTING
{
    public static void main(String[] args) {
        
        //widening typecasting is used to convert small data type to large data type
        //widening can be done both implicitly and explicitly
        int x=20;
        double y=x;

        System.out.println("before widening x="+x+"\nafter widening implicitly x="+y);

        double xy=(double) 30;//the data type must be closed in parenthasis

        System.out.println("\n\nwidening explicitly xy="+xy);

        int z=20;
        float yz=20;
        System.out.println("\n\nbefore widening x="+z+"\nafter widening implicitly x="+yz);

        float xc=(float) 34;//widening explicitly
        System.out.println("\n\nwidening explicitly "+xc);


        //narrowing it is used to convert large data type to small data type
        //it can be done only explicitly
        float f=36.5f;
        int a=(int)f;

        System.out.println("\n\nbefore narrowing f="+f+"\nafter narrowing explicitly f="+a);

        double d=36.590;
        short b=(short)d;

        System.out.println("\n\nbefore narrowing d="+d+"\nafter narrowing explicitly d="+b);


    }
}
