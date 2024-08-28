class reference_variable
{   
    int c;
    void add(int x ,int y)
    {
        c=x+y;
        //System.out.println("addition is : "+c);
    }
    public static void main(String[] args) {
        
        reference_variable object1=new reference_variable();//creating reference variable

       
        object1.add(10,20);
       

        reference_variable object2=new reference_variable();

       

        
        object2.add(50, 100);

      
        


        
        
        reference_variable object3=object1;//copying adress which is in object1 to object3

       
       System.out.println("\n\nobject 1 adress : "+object1+"\n\n object 2 adress : "+object2+"\n\nobject 3 adress : "+object3);


            System.out.println("\n\nobject 1 result :"+object1.c);
            System.out.println("\n\nobject 2 result :"+object2.c);
            
            object3.add(33, 44);

            System.out.println("\n\nobject 3 result : "+object3.c);
            System.out.println("\n\nobject 1 result :"+object1.c+"\n\n");



    }
}