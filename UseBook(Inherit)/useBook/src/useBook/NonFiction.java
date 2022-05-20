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
public class NonFiction extends Book {

    public NonFiction(String bookTitle) {
        super(bookTitle);
        setPrice();
    }

    @Override
    public void setPrice() {
        {
            price = 37.99;
        }
    }

    public String displayDetails() {
        return "Book: " + super.bookTitle + " \nPrice: " + super.getPrice();
    }

}
