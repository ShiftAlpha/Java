
package javaarraylist;

import java.util.ArrayList;

public class JavaArrayList {

   
    public static void main(String[] args) {
        
        //array list also called a non generic collection 
        ArrayList <String> customers = new ArrayList<String>();
        
        customers.add("Rayhaan");
        
        
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
       
        
    }
    
}
