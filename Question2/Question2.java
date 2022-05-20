/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author DhiravRana 
 * Student Number: 16012775
 * Question 2
 * Prog Assignment
 */
public class Question2 {

    public static void main(String[] args) {
//Creating variables----------------------------------------------------------------------\\
        String Student1, Student2, Student3;// 3 student variables
        String randomColour1, randomColour2, randomColour3;// 3 random colour variables

        int randomDigit1, randomDigit2, randomDigit3;// 3 random digit variables

//____Random number generator(Math.random)____
//(https://www.geeksforgeeks.org/)
//Panday, N.
//(https://www.geeksforgeeks.org/java-math-random-method-examples/)
//int rand = (int)(Math.random() * range) + min
        randomDigit1 = (int) (Math.random() * 9000) + 1000;
        randomDigit2 = (int) (Math.random() * 9000) + 1000;
        randomDigit3 = (int) (Math.random() * 9000) + 1000;
        
//____Random object____
//(https://docs.oracle.com/)
//(https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
//Random rand = new Random();
        Random rand = new Random();
        
//____Initialize a list object in java____
//(https://stackoverflow.com/)
//Username: Sartavius
//(https://stackoverflow.com/questions/13395114/how-to-initialize-liststring-object-in-java)
//List<String> (variable) = new List<String>();
        List<String> listColour = Arrays.asList("RED", "BLUE", "WHITE");
                                            
//Input Student Names---------------------------------------------------------------------\\
        Student1 = JOptionPane.showInputDialog(null, "Please enter the first student name");
        Student2 = JOptionPane.showInputDialog(null, "Please enter the second student name");
        Student3 = JOptionPane.showInputDialog(null, "Please enter the third student name");

//____Random Index____
//Use random object, rand; assign 3 seperate variables (randomIndex,1,2,3) to a random 'String' from the List

        int randomIndex1 = rand.nextInt(listColour.size());
        randomColour1 = listColour.get(randomIndex1);

        int randomIndex2 = rand.nextInt(listColour.size());
        randomColour2 = listColour.get(randomIndex2);

        int randomIndex3 = rand.nextInt(listColour.size());
        randomColour3 = listColour.get(randomIndex3);

//Output----------------------------------------------------------------------------------\\
        JOptionPane.showMessageDialog(null, "SCHOOL HOUSE ASSIGNMENT\n***********************\n"
                + Student1 + " assigned to the " + randomColour1 + " with student number " + randomColour1 + randomDigit1 + "\n"
                + Student2 + " assigned to the " + randomColour2 + " with student number " + randomColour2 + randomDigit2 + "\n"
                + Student3 + " assigned to the " + randomColour3 + " with student number " + randomColour3 + randomDigit3);

    }

}
