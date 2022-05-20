
package usebook;


public abstract class Book {
    
    protected String bookTitle;
    protected double price;
    

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    

    public String getBookTitle() {
        return bookTitle;
    }

    public double getPrice() {
        return price;
    }
    
    
    abstract void setPrice();

    
    
    @Override
    public String toString() {
        return "Book title: " + this.bookTitle + "   Price $: " + this.price;
    }
    
    
}
