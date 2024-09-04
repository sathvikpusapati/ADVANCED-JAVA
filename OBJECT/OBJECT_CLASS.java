package OBJECT;

class OBJECT_CLASS
{   
    int c;
    void add(int x ,int y)
    {
        c=x+y;
        //System.out.println("addition is : "+c);
    }
    
    
    public static void main(String[] args) 
    {
        
        OBJECT_CLASS object1=new OBJECT_CLASS();//creating reference variable

       
        object1.add(10,20);
       

        OBJECT_CLASS object2=new OBJECT_CLASS();
 
        object2.add(50, 100);
        
       OBJECT_CLASS object3=object1;//copying adress which is in object1 to object3

       
       System.out.println("\n\nobject 1 adress : "+object1+"\n\n object 2 adress : "+object2+"\n\nobject 3 adress after copying object1 address to a class type reference variable: "+object3);


            System.out.println("\n\nobject 1 result :"+object1.c);
            System.out.println("\n\nobject 2 result :"+object2.c);
            
            object3.add(33, 44);

            System.out.println("\n\nobject 3 result : "+object3.c);
            System.out.println("\n\nobject 1 result :"+object1.c+"\n\n");



    }
}