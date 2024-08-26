public class constructor_with_parameters {

    // for sure we want to declare variables outsid econstructor to call them
    String student_name;
    int age,roll_no;
    constructor_with_parameters(String name, int x,int y)
    {
         student_name=name;
               age=x ;roll_no=y;

    }
    public static void main(String[] args) {
        
        constructor_with_parameters obj=new constructor_with_parameters("sathvik", 24,117);

        System.out.println(obj.student_name+"\n"+ obj.age+"\n"+obj.roll_no);
    }
}
