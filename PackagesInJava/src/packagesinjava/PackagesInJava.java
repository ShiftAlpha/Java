
package packagesinjava;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class PackagesInJava {


    public static void main(String[] args) {
        
        ArrayList <String> userNames= new ArrayList<String>();
        
        userNames.add("Ram");
        userNames.add("Shyam");
        userNames.add("CPS");
        userNames.add("John");
        userNames.add("Steve");
        
        
        ArrayList<Integer> password = new ArrayList<Integer>();
        
        password.add(1233);
        password.add(44442);
        password.add(76522);
        password.add(4573);
        password.add(9455);
        
        System.out.println(userNames);
        
//        String userInput = JOptionPane.showInputDialog("Please enter your username ");
//        
//        if (userInput.equals(userNames.size())) {
//            
//            JOptionPane.showMessageDialog(null, "Welcome");
//            JOptionPane.showInputDialog("Please enter your password");
//            
//        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();
        
        String ciphertext = "";
        char alphabet;
        
        for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
  }

}

