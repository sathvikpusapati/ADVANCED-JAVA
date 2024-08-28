/* Upcasting is safe and allows the parent class reference to refer to a child class object.
You can only access members (methods and fields) that are defined in the parent class,
 even if the object is of the child class. */
class father
{
    int salary=35000;
    
    void disp()
    {
        System.out.println("parent class");
    }
}
class son extends father
{
    int salary=500009;
    void dispson()
    {
        System.out.println("child class");
    }
}
public class class_typecasting {

    public static void main(String[] args) {
        
        //class up casting//opposite of method overriding
        father obj=new son();

        obj.disp();
        
        System.out.println(obj.salary);

        //class downcasting//down casting can be done after only upcasting

        son obj2=(son) obj;

        obj2.dispson();
        System.out.println(obj2.salary);

        obj2.disp();



    }


    
}
