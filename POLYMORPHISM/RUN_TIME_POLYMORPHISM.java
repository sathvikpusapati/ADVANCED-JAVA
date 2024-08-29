package POLYMORPHISM;
class bike_150cc
{

    void speed()//DYNAMIC BINDING MULTIPLE COPIES
    {
        System.out.println("bike speed is 170 kmph");
    }
}

class bike_200cc extends bike_150cc
{
    void speed()//DEVELOPING A SUB CLASS METHOD WITH SAME NAME BUT WITH DIFFERENT IMPLIMENTATION
    {
        System.out.println("after modification bike speed is 250 kmph");
    }
}

class RUN_TIME_POLYMORPHISM
{
    public static void main(String[] args) {
        
        //i am using inheritence so i can call the parent class method from child class
        // but we are doing method over riding so i will get the method which was in sub class
        bike_150cc obj=new bike_200cc();

        obj.speed();

    }

}
