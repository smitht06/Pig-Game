import java.util.Random;
import java.util.Scanner;

public class Pig {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig game!");
        char choice = 'q';
        int score = 0;
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
                System.out.println("Your turn score is: " + roll + " if you stop now your total score will be " + roll);
            }
        }


    }

    private static int random(int seed){
        int diceRoll = (int)(seed * Math.random());
        return diceRoll;
    }
}
