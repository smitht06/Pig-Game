import java.util.Random;
import java.util.Scanner;

public class Pig {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig game!");
        char choice;
        int userTurnScore = 0;
        int userTotalScore = 0;
        int computerTurnScore = 0;
        int computerTotalScore = 0;
        int scoreToWin;
        int seed;


        System.out.println("Enter the number to seed, seed less than 0 will not seed: ");
        seed = scnr.nextInt();
        if(seed < 0){
            seed = 0;
        }


        System.out.println("Welcome to the Pig game!");
        System.out.println("Enter score to win: ");
        scoreToWin = scnr.nextInt();


        while(userTotalScore < scoreToWin || computerTotalScore < scoreToWin){
            System.out.println("Your Turn!");
            while(true){

                System.out.println("Enter r to roll or s to stop.");
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
                    System.out.println("Your current score is " +userTotalScore+ "\nif you stop now your total score will be " + userTurnScore);
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
