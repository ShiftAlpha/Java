
package question7;


public class Package {
    
    
    protected double weight;
    protected char shippingMethod;
    protected double shippingCost;
    

    public Package(double weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        calculateCost();
    }
    
    
    public double calculateCost() {

        if (weight >= 1 && weight <= 8) {

            switch (shippingMethod) {

                case 'A':
                case 'a':
                    shippingCost = 2.00;
                    break;

                case 'T':
                case 't':
                    shippingCost = 1.50;
                    break;

                case 'M':
                case 'm':
                    shippingCost = 0.50;
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

        } else if (weight >= 9 && weight <= 16) {

            switch (shippingMethod) {

                case 'A':
                case 'a':
                    shippingCost = 3.00;
                    break;

                case 'T':
                case 't':
                    shippingCost = 2.35;
                    break;

                case 'M':
                case 'm':
                    shippingCost = 1.50;
                    break;

                default:
                    break;
            }

        } else if (weight >= 17) {

            switch (shippingMethod) {

                case 'A':
                case 'a':
                    shippingCost = 2.00;
                    break;

                case 'T':
                case 't':
                    shippingCost = 1.50;
                    break;

                case 'M':
                case 'm':
                    shippingCost = 0.50;
                    break;

                default:
                    break;
            }
        }

        return shippingCost;

    }


    
    public String display(){
        
        return    " Normal shipping information\n"
                + " Weight          : " + weight + "KG" 
                + "\n Shipping method : " + shippingMethod 
                + "\n Shipping cost   : $" + shippingCost + "\n" ;
        
        
    }
    
}
