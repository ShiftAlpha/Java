package usebook;

public class Fiction extends Book {
    

    public Fiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }

     
    public double getPrice() {
        return price;
    }
    
    

    @Override
    public void setPrice() {
        {
            super.price = 24.99;  
        }
    }
    
    

    public String displayDetails() {

        return "Book : " + this.bookTitle + " with a price of " + this.getPrice();

    }
    
    
//    public boolean equals(Fiction obj){
//    
//        if (this.equals(obj)) {
//            return true;
//        }
//        else{
//            return false;
//        }
//        
//    }
    
    
    
    public boolean equals(Fiction obj){
        
        boolean result;
        
        if (this.bookTitle.equals(obj.bookTitle) && this.price == obj.price) {
            result = true;
        }
        
        else {
            result = false;
        }
        
        return result;
    }
    
    
    
       
            
}
        

