
package usebook;


public class NonFiction extends Book{
    

    public NonFiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }
    
    
    @Override
    public void setPrice() {
        {
            super.price = 37.99;
        }
    }
    
  
     public String displayDetails() {

        return "Book : " + this.bookTitle + " with a price of " + this.price;

    }
     
     
     public boolean equals(NonFiction obj){
        
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
