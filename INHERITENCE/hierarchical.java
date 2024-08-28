class car
{
    void toyota(String colo)
    {
        String a=colo;
        System.out.println("toyota car color is "+a);
    }

}

class person1 extends car
{
    void tata(String brand)
    {
        System.out.println(brand+" color is red");
    }

}
class person2 extends car
{
    void tata(String brand)
    {
        System.out.println(brand+" color is red");
    }

}
public class hierarchical {

    public static void main(String[] args) {
        
        person1 obj= new person1();
        
        obj.toyota("green");
       

        obj.tata("harrier");
       
        person2 obj2=new person2();
       
        obj2.toyota("red");
       
        obj2.tata("safari");


    }
    
}
