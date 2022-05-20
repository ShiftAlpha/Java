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
public class UseBook {
    
    public static void main(String[] args){
        Fiction book1 = new Fiction("50 shades of gray ");
        NonFiction nfBook1 = new NonFiction("TinTin");
        
        System.out.println(book1.displayDetails());
        System.out.println(nfBook1.displayDetails());
    }
    
}
