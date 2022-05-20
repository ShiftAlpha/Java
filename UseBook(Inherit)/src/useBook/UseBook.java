
package usebook;


public class UseBook {
    
    
   

    
    public static void main(String[] args) {
        
        Fiction fictionBook1 = new Fiction("50 Shades of Gray");
        NonFiction nonficBook1 = new NonFiction("TinTin");
        
        
        System.out.println(fictionBook1.displayDetails());
        
        System.out.println(nonficBook1.displayDetails());
        
        Book[] bookArray = new Book[10];
        
        bookArray[0] = new Fiction("Fictonal book one");
        bookArray[1] = new Fiction("Fictonal book two");
        bookArray[2] = new Fiction("Fictonal book three");
        bookArray[3] = new Fiction("Fictonal book four");
        bookArray[4] = new Fiction("Fictonal book five");
        
        bookArray[5] = new NonFiction("NonFictonal book six");
        bookArray[6] = new NonFiction("NonFictonal book seven");
        bookArray[7] = new NonFiction("NonFictonal book eight");
        bookArray[8] = new NonFiction("NonFictonal book nine");
        bookArray[9] = new NonFiction("NonFictonal book ten");
        
        
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i]);
        }
        
        
    
        double sumFic = 0;
        double sumNoneFic = 0; 
        
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getClass().toString().equals("class usebook.Fiction")) {
                
                 sumFic += bookArray[i].getPrice();

            } else {
                
                sumNoneFic += bookArray[i].getPrice();
                
            }
        }

        System.out.println("Total of Fictional: $" + sumFic);

        System.out.println("Total of None Fictional: $" + sumNoneFic);
        
        
        
        Fiction f1 = new Fiction("Hello");
        Fiction f2 = new Fiction("Hello");
        
         
        NonFiction nf1 = new  NonFiction("Hello nonfiction");
        NonFiction nf2 = new  NonFiction("Hello nonfiction");
        
        
        
        
        
        System.out.println(f1.equals(f2));//comparing the fiction objects
        
        System.out.println(nf1.equals(nf2));//comparing the nonfiction objects

    }
    
}
