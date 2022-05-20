/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useBook;

/**
 *
 * @author 16012775
 */
public abstract class Book {
    
    protected String bookTitle;
    protected double price;
    
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }
    

    public String getBookTitle() {
        return bookTitle;
    }

    public double getPrice() {
        return price;
    }
    
    abstract public void setPrice();
    
    @Override
    public String toString() {
        return "Book : "  + bookTitle + "Price : " + price ;
    }
    
}
