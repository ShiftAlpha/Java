
package customerarraylist;


public class Customer {
    
    
    public String name;
    private String address;
    private double discount;
    private int customerID;
  
    
    //constructors
    public Customer(String name, String address, double discount, int customerID) {
        this.name = name;
        this.address = address;
        this.discount = discount;
        this.customerID = customerID;
    }
    
    
    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getDiscount() {
        return discount;
    }

    public int getCustomerID() {
        return customerID;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    
    //to String
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", discount=" + discount + ", customerID=" + customerID + '}';
    }
    
    
    
    
}
