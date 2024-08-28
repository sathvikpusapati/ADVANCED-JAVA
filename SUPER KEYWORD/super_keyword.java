class house
{
    void hall()
    {
        System.out.println("sofa , recliners");
    }
}

class house2 extends house
{
    void hall()
    {
        System.out.println("sofa , recliners , tv , sound system");
        super.hall();
        //only implemented in sub class
        //useed to implement  both the child class and super class methods in method overriding

    }
}

class super_keyword
{
    public static void main(String[] args) {
        
        house2 ob=new house2();

        ob.hall();
    }
}