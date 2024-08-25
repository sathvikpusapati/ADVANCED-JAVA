public class Finding_element_print_all_index_numbers 
{

        public static void main(String[] args) 
        {    
                int a[]={12,23,45,69,69,69,69};
                int c=0;
                int find=69;
                for(int i=0;i<a.length;i++)
                {
    
                    if(find==a[i])
                    {
                        System.out.println("element found in the index number :"+i);
    
                        continue;
                    }
                    else
                    {
                        c=c+1;
                    }
    
                }
    
                if(c==a.length)
                {
                    System.out.println("element not found better luck next time");
                
    
                }

         }
        
 }
    
    

