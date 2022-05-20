package Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 16012775
 * Dhiray Rana
 * Prog Assignment 
 * Question 1
 */
//class word wars
public class wordWars {

    //static variables for attributes of the game
    //player names 
    static String playerName1;
    static String playerName2;

    //player scores 
    static int playerScore1 = 0;
    static int playerScore2 = 0;

    //string containing alphabet
    static String originalAlphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

    //word input for both players
    static String wordInput = "";
    //boolean flag
    static boolean flag = true;

    //string converted to array list - split at each letter to for an index for each letter 
    static List<String> alphabetsArray = new ArrayList<String>(Arrays.asList(originalAlphabet.split(" ")));

    //main method 
    public static void main(String[] args) {
        //print intro
        System.out.println("Welcome to WORD WARDS game");
        //condition question
        System.out.println("\nPress (1) to start the game."
                + "\nPress any other key to exit the game"
                + "\nEnter your selection: ");
        System.out.println("***********************************");
        //scanner wordInput class
        Scanner sc = new Scanner(System.in);
        //condition question wordInput
        String choiceAnswer = sc.nextLine();
        //condtion - if wordInput is 1 or not 1 
        if (!choiceAnswer.equals("1")) {
            //exit method
            System.exit(0);
            //else condtion 
        } else {
            //input player names
            System.out.print("Enter player 1 name: ");
            playerName1 = sc.nextLine();
            System.out.print("Enter player 2 name: ");
            playerName2 = sc.nextLine();
            //boolean set to false

            //while condition - if wordInput is equal to ??? then exit
            while (!wordInput.equals("???")) {
                //display letters method to display remaining letters
                displayLetters();
                //if flag is true
                if (flag) {
                    //enter word 
                    System.out.print(playerName1 + " enter your word: ");
                    //word saved as wordInput 
                    wordInput = sc.nextLine();
                    //if wordInput equals ??? exit else print next statement  
                    if (!wordInput.equals("???")) {
                        //enter y to agree with validity of word 
                        System.out.println("Enter y if both agree to the word");
                    }
                    //variable agreeYes saved as user wordInput to agree
                    String agreeYes = sc.nextLine();
                    //boolean flag = false
                    flag = false;
                    //while condition - validate word method or agreeYes variable is not true 
                    while (!validateWord(wordInput) || !agreeYes.equalsIgnoreCase("y")) {
                        //error statment 
                        System.out.println("YOU ENTERED WORD THAT CONTAINS LETTER THAT IS NOT PRESENT OR BOTH PLYERS DID NOT AGREE! PLEASE ENTER ANOTHER");
                        //re enter word after error statement
                        System.out.print(playerName1 + " enter your word: ");
                        wordInput = sc.nextLine();
                        //if condition is = ???
                        if (wordInput.equals("???")) {
                            //close program 
                            break;
                        }
                        //else enter y to agree with validity of word
                        System.out.println("Enter y if both agree to the word");
                        agreeYes = sc.nextLine();
                    }
                    //if condition is not ???
                    if (!wordInput.equals("???")) {
                        //score = score + wordInput length
                        playerScore1 += wordInput.length();
                    }//else call remove letter method that takes in wordInput variable
                    removeLetter(wordInput);
                    //else condition to continue word game
                } else {
                    flag = true;
                    //enter word 
                    System.out.print(playerName2 + " enter your word: ");
                    //word saved as wordInput
                    wordInput = sc.nextLine();
                    //if condition - wordInput does not equal ???
                    if (!wordInput.equals("???")) {
                        //statement to agree on validity of word 
                        System.out.println("Enter y if both agree to the word");
                    }
                    //variable agreeYes saved as user wordInput to agree
                    String yes = sc.nextLine();
                    //while condition - validate word method or agreeYes variable is not true 
                    while (!validateWord(wordInput) || !yes.equalsIgnoreCase("y")) {
                        //error statment 
                        System.out.println("YOU ENTERED WORD THAT CONTAINS LETTER THAT IS NOT PRESENT OR BOTH PLYERS DID NOT AGREE! PLEASE ENTER ANOTHER");
                        //re enter word after error statement
                        System.out.print(playerName2 + " enter your word: ");
                        wordInput = sc.nextLine();
                        //if condition is = ???
                        if (wordInput.equals("???")) {
                            //close program
                            break;
                        }
                        //else enter y to agree with validity of word
                        System.out.println("Enter y if both agree to the word");
                        yes = sc.nextLine();
                    }
                    //if condition is not ???
                    if (!wordInput.equals("???")) {
                        //second score = second score + wordInput length
                        playerScore2 += wordInput.length();
                    }
                    //else call remove letter method that takes in wordInput variable
                    removeLetter(wordInput);
                }
            }
            // comparison between two scores of both players
            if (playerScore1 > playerScore2) {
                //score 1 is greater than score two - winner is player 1 
                System.out.println("Winner of the game is: " + playerName1 + " with score of: " + playerScore1);
                //else 
            } else if (playerScore2 > playerScore1) {
                //score 2 is greater than score 1 - winner is player 2 
                System.out.println("Winner of the game is: " + playerName2 + " with score of: " + playerScore2);
            } else {
                //else both points are equal - game is tied
                System.out.println("Match Tie");
            }
        }
    }

    //validate word method - takes in a string variable named word but is also a boolean type
    //to verify word validity copared to letters left over 
    public static boolean validateWord(String word) {
        //for loop for character ch to run through each letter of word 
        for (char ch : word.toCharArray()) {
            //if statement - alphabetsArray variable does not contain the value of ch 
            if (!alphabetsArray.contains(String.valueOf(ch))) {
                //boolean value = false
                return false;
            }
        }//else return true 
        return true;
    }

    //remove letter method - takes in string 
    //to remove non-repeating letters from wordInput word - removed from alphabet
    public static void removeLetter(String s) {
        //for loop - char ch to run through each char of the array
        for (char ch : s.toCharArray()) {
            //remove from alphabet 
            alphabetsArray.remove(String.valueOf(ch));
        }
    }

    //display method to display letters 
    public static void displayLetters() {
        //display leftover letters
        System.out.print("Alphabet letters left: ");
        //for loop to run through the alphabets array
        for (String string : alphabetsArray) {
            //print letters leftover 
            System.out.print(string + " ");
        }
        //new line print
        System.out.println();
    }
}
