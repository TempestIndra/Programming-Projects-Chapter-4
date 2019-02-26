import java.util.Scanner;

public class PP4_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Boolean done = true;
        while(done){
            int n = (int )(Math.random() *100 + 1);
            Boolean endGame = true;
            int attempt = 0;
            System.out.println("Guess a number from 1 to 100");
            while(endGame){
                int userGuess = sc.nextInt();
                if(userGuess > n){
                    System.out.println("Too high try again");
                    attempt++;
                }else if (userGuess < n){
                    System.out.println("Too low try again");
                    attempt++;
                }else if(userGuess == n){
                    System.out.println("Correct");
                    endGame = false;
                }
            }
            System.out.println("it took you " + attempt +" times");
            System.out.println("Would you like to try again? 1 for yes ,2 for no");
            int userAnswer = sc.nextInt();
            if(userAnswer == 1) {
                System.out.println("okay again");
            }else if (userAnswer == 2) {
                System.out.println("okay bye bye");
                done =false;
            }else{
                System.out.println("wrong answer bye bye");
                done = false;
            }
        }

    }
}

/*
* Design and implement an application that plays the Hi-Lo guessing
* game with number. The program should pick a random number
* between 1 and 100(inclusive) and then repeatedly prompt the
* user to guess the number. On each guess, report to the user that
* he or she is correct that the guess is hugh or low. Continue ac-
* cepting guesses until the user guesses correctly or chooses to quite
* Count the number of guesses, and report that value when the user
* guesses correctly. At the end of each game (by quitting or a correct
* guess), prompt to determine whether the user wants to play again
* Continue playing games until the user chooses to stop.
*/