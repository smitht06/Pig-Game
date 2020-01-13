import java.util.Random;
import java.util.Scanner;

public class Pig {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig game!");
        char choice = 'q';
        int score = 0;
        int finalScore = 0;
        System.out.println("Enter the number to seed: ");
        int seed = scnr.nextInt();
        System.out.println("Welcome to the Pig game!");
        while(choice != 's'){
            System.out.println("Enter r to roll or s to stop.");
            choice = scnr.next().charAt(0);
            if(choice == 'r'){
                int roll = random(seed);
                System.out.println("You rolled a " + roll);
                score += roll;
                System.out.println("Your turn score is: " + roll + " your current score is " +finalScore+ "\nif you stop now your total score will be " + score);
            }else if (choice == 's'){
                finalScore = score;
                System.out.println("Your final score is " + finalScore);
            }
        }


    }

    private static int random(int seed){
        Random diceRoll = new Random();
        int result = diceRoll.nextInt(7);
        diceRoll.setSeed(seed);
        return result;
    }
}
