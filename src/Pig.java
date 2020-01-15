//import random and scanner classes
import java.util.Random;
import java.util.Scanner;

//create pig class with main method
public class Pig {
    public static void main(String [] args){
        //declare variables to hold scanner, scores and seed
        Scanner scnr = new Scanner(System.in);
        char choice;
        int userTurnScore = 0;
        int userTotalScore = 0;
        int computerTurnScore = 0;
        int computerTotalScore = 0;
        int scoreToWin;
        int seed;

        //display welcome message and ask for seed
        System.out.println("Welcome to the Pig game!");
        System.out.println("Enter the number to seed, seed less than 0 will not seed: ");
        //store user entered seed and add if statment to set seed to 0 if user enters negative number
        seed = scnr.nextInt();
        if(seed < 0){
            seed = 0;
        }

        //prompt user for wining score and use variable to store integer entered
        System.out.println("Let's play!");
        System.out.println("Enter score to win: ");
        scoreToWin = scnr.nextInt();

        //while loop to break when computer or player reaches the total score to win
        while(userTotalScore < scoreToWin || computerTotalScore < scoreToWin){
            System.out.println("Your Turn!");
            //players turn
            while(true){
                //enter r to roll and s to hold
                System.out.println("Enter r to roll or s to hold.");
                choice = scnr.next().charAt(0);
                if(choice == 'r'){
                    int roll = random(seed);
                    System.out.println("\nYou rolled a " + roll);
                    userTurnScore += roll;
                    if(roll == 1){
                        System.out.println("Your turn is over, your current score is " + userTotalScore);
                        userTurnScore = userTurnScore-1;
                        break;
                    }
                    System.out.println("Your current score is " +userTotalScore+ "\nif you hold now your total score will be " + userTurnScore);
                //total score only changes if player holds
                }else if (choice == 's'){
                    userTotalScore = userTurnScore;
                    System.out.println("Your final score is " + userTotalScore);
                    break;
                }
            }
            if(userTotalScore < scoreToWin){
                System.out.println("\nComputer's turn:");
                while(computerTotalScore <= scoreToWin){

                    int computerRoll = random(seed);
                    System.out.println("Computer rolled: " + computerRoll);
                    computerTurnScore += computerRoll;
                    if(computerRoll == 1){
                        System.out.println("Computer rolled a 1.");
                        computerTurnScore = 0;
                        break;
                    }else if(computerTurnScore >= 20){
                        computerTotalScore += computerTurnScore;
                        System.out.println("Computer holds at: " + computerTotalScore);
                        computerTurnScore = 0;
                        break;
                    }
                    if (computerTurnScore + computerTotalScore >= scoreToWin){
                        computerTotalScore += computerTurnScore;
                        System.out.println("Computer holds at: " + computerTotalScore);
                        break;
                    }
                }
                if(computerTotalScore >= scoreToWin){
                    System.out.println("computer wins!");
                    break;
                }
            }else{
                System.out.println("You win!");
                break;
            }
        }
    }
        private static int random(int seed){
            Random diceRoll = new Random();
            int result = diceRoll.nextInt(6-1+1)+1;
            diceRoll.setSeed(seed);
            return result;
        }
}
