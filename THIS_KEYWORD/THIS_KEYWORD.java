class this_example
{   //using this keyword in construtor
    // following are instance variables
     int age;double height;
     String name;

    //we use this keyword when the instance variable names and method parameter names  are same

    this_example(int age,String name,double height)
    {
        this.age=age;
        this.name=name;
        this.height=height;
        System.out.println("student name :"+name+"\nStudent age :"+age+"\nstudent height :"+height);
    }
}

class THIS_KEYWORD
{   //using this keyword in method
    // following are instance variables
     int age;double height;
     String name;

    //we use this keyword when the instance variable names and method parameter names  are same

    public void student(int age,String name,double height)
    {
        this.age=age;
        this.name=name;
        this.height=height;
        System.out.println("student name :"+name+"\nStudent age :"+age+"\nstudent height :"+height);
    }
    
    public static void main(String[] args) {
        
        THIS_KEYWORD c=new THIS_KEYWORD();
        c.student(16,"sathvik",5.4);
        System.out.println(" ");
        this_example d=new this_example(24, "sathvik raju", 5.4);
        
    }
}
