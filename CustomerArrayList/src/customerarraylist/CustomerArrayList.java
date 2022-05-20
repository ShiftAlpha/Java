
package customerarraylist;

import java.util.ArrayList;

public class CustomerArrayList {

   
    public static void main(String[] args) {
      
        ArrayList<Customer> customers = new ArrayList<Customer>();
        
        Customer c1 = new Customer("Rayhaan", "123 bush " ,56 ,101);
        Customer c2 = new Customer("Jack", "1245 grass" ,34 ,102);
        Customer c3 = new Customer("John", "23 field" ,23 ,103);
        Customer c4 = new Customer("Adam", "6454 road" ,45 ,104);
        Customer c5 = new Customer("Vat", "124 pool" ,23 ,105);
       
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        
        
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        
        

        double total = 0;
        double avg;
        for (int i = 0; i < customers.size(); i++) {
            total += customers.get(i).getDiscount();

        }

        avg = total / customers.size();
        System.out.println("\nThe Average is:" + avg);

    }

}
