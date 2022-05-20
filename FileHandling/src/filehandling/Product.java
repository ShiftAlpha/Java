
package filehandling;


public class Product {
    
    protected String brand;
    protected String description;
    protected int quantity;
    protected double cost;
    protected double selling;
    

    public Product(String brand, String description, int quantity, double cost, double selling) {
        this.brand = brand;
        this.description = description;
        this.quantity = quantity;
        this.cost = cost;
        this.selling = selling;
    }
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    

    public double getSelling() {
        return selling;
    }

    public void setSelling(double selling) {
        this.selling = selling;
    }
    
    
    public String encode(){
        
    return this.brand + "," + this.description + "," + this.quantity + "," + this.cost + "," + this.selling;
    }
    
    
}
