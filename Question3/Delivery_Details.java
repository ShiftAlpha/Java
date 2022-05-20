package Question3;

/**
 * @author DhiravRana 
 * Student Number: 16012775
 * Question 3
 * Prog Assignment
 */
public class Delivery_Details {

//variables declared
    String town;
    String delivCompany;
    String weight;
    
    double price;
    double VAT;

//-----------Constructor--------------------------------------//
    public Delivery_Details(String town, String delivCompany, String weight, double price, double VAT) {
        this.town = town;
        this.delivCompany = delivCompany;
        this.weight = weight;
        this.price = price;
        this.VAT = VAT;
    }

//-----------Get Methods--------------------------------------//
    public String getTown() {
        return town;
    }

    public String getDelivCompany() {
        return delivCompany;
    }

    public String getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getVAT() {
        return VAT;
    }

//-----------Set Methods--------------------------------------//    
    public void setTown(String town) {
        this.town = town;
    }

    public void setDelivCompany(String delivCompany) {
        this.delivCompany = delivCompany;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVAT(double VAT) {
        this.VAT = 0.14;
    }

}
