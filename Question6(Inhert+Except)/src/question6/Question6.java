package question6;


public class Question6 {

    public static void main(String[] args) {
        
        
        Apartment[] apartment = new Apartment[5];
        

        try {
            apartment[0] = new Apartment("Umdlotitie", 123, 3, 1500);
        } catch (ApartmentException ex) {
          System.out.println(ex.getMessage());
        }
        
        
        try {
            apartment[1] = new Apartment("Kwamashu", 4, 5, 1500);
        } catch (ApartmentException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        try {
            apartment[2] = new Apartment("Durabndas norath", 5567, 6, 1500);
        } catch (ApartmentException ex) {
           System.out.println(ex.getMessage());
        }
        
        
        try {
            apartment[3] = new Apartment("Efinnasams", 12, 3, 2500);
        } catch (ApartmentException ex) {
           System.out.println(ex.getMessage());
        }
        
        
        try {
            apartment[4] = new Apartment("La alscui", 500, 2, 12321);
        } catch (ApartmentException ex) {
            System.out.println(ex.getMessage());
        }
        
       
    }

}
