class bike_150cc
{

    void speed()
    {
        System.out.println("bike speed is 170 kmph");
    }
}

class bike_200cc extends bike_150cc
{
    void speed()
    {
        System.out.println("after modification bike speed is 250 kmph");
    }
}

class method_overriding
{
    public static void main(String[] args) {
        
        //i am using inheritence so i can call the parent class method from child class
        // but we are doing method over riding so i will get the method which was in sub class
        bike_150cc obj=new bike_200cc(); //upcasting

        System.out.println("now i am using upcasting \n");
        obj.speed();
        
        System.out.println("\n now i am using method overriding in the same class\n");
        bike_150cc obj2=new bike_150cc();//over riding
        obj2.speed();

        	
        System.out.println("\nagain using upcasting\n");
        
        bike_150cc obj3=new bike_200cc();//sub class object is referenced by parentb class

        obj3.speed();

       
    }

}
