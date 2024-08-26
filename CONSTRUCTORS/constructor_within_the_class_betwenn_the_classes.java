
class lailaa
{
    int x;
     lailaa(int y)
    {
        x=y;
        System.out.println(x);
        
    }


}

public class constructor_within_the_class_betwenn_the_classes {

    int c;
    constructor_within_the_class_betwenn_the_classes(int z)
    {

        c=z;
        System.out.println(z);


    }

    public static void main(String[] args) {
        
        lailaa bj=new lailaa(8);

        System.out.println(bj.x); // only variables declared in the class will work

        constructor_within_the_class_betwenn_the_classes bl=new constructor_within_the_class_betwenn_the_classes(100);
        System.out.println(bl.c);
    
    }
    
}
