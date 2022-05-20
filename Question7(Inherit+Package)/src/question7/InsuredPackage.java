
package question7;


public class InsuredPackage extends Package{
   
    
    protected double additionalCost;
    
    

    public InsuredPackage(double weight, char shippingMethod) {
        super(weight, shippingMethod);
    }
    
    
     public double getAdditionalCost() {
        return additionalCost;
    }

  
    @Override
    public double calculateCost() {

        super.calculateCost();

        if (shippingCost >= 3.01) {
            additionalCost = 5.55;
        } 
        
        else if (shippingCost >= 1.01) {
            additionalCost = 3.95;
        } 
        
        else if (shippingCost >= 0) {
            additionalCost = 2.45;
        }

        additionalCost += shippingCost;
        
        return additionalCost;

    }
    
    
   @Override
     public String display(){
    
        return    " Information for shipping with insurance\n" 
                + " Weight          : " + weight + "KG"
                + "\n Shipping method : " + shippingMethod
                + "\n Shipping cost   : $" + shippingCost
                + "\n Additional cost : $" + additionalCost;
                        
       
    } 
}
