package question6;

public class Apartment {

    protected String streetAddress;
    protected int apartmentNumber;
    protected int numOfBedrooms;
    protected double rentValue;
    

    public Apartment(String streetAddress, int apartmentNumber, int numOfBedrooms, double rentValue) throws ApartmentException{
        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.numOfBedrooms = numOfBedrooms;
        this.rentValue = rentValue;

        try {

            if ((apartmentNumber < 100) || (numOfBedrooms < 1 || numOfBedrooms > 4) || (rentValue < 500) || (rentValue > 2500)) {
                throw new ApartmentException("Error");
            }

        } catch (ApartmentException e) {
            System.out.println(e.getMessage() + " at apartment " + this.apartmentNumber);
        }
        
        
    }

}
    
    
    
    
    
    
    

    

