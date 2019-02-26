import java.util.*;

public class PP4_13{
    public static void main (String[] args)
    {
        ArrayList<String> choices = new ArrayList<String>();

        choices.add ("rock");
        choices.add ("paper");
        choices.add ("scissors");

        Scanner scan = new Scanner (System.in);

        int wins = 0, loses = 0, ties = 0;

        ArrayList<String> playAgain = new ArrayList<String>();

        playAgain.add ("y");
        playAgain.add ("n");
        playAgain.add ("Y");
        playAgain.add ("N");

        String another = "y";

        while (another.equalsIgnoreCase("y"))
        {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String usersChoice = scan.nextLine();

            while (! choices.contains(usersChoice.toLowerCase()))
            {
                System.out.print("Invalid Entry. " +
                        "Enter Rock, Paper, or Scissors: ");
                usersChoice = scan.nextLine();
            }

            int usersChoiceIndex = choices.indexOf(usersChoice.toLowerCase());

            int computersChoiceIndex = (int)(Math.random()*3);
            String computersChoice = choices.get(computersChoiceIndex);

            if (usersChoiceIndex == computersChoiceIndex)
            {
                System.out.println("We tried, we both choose " +
                        computersChoice + "!");
                ties++;
            }
            else
            {
                if ( usersChoiceIndex == 0 && computersChoiceIndex == 1 ||
                        usersChoiceIndex == 1 && computersChoiceIndex == 2 ||
                        usersChoiceIndex == 2 && computersChoiceIndex == 0)
                {
                    System.out.println("I win, " + computersChoice +
                            " beats " + usersChoice.toLowerCase() + "!");
                    loses++;
                }
                else
                {
                    System.out.println("You win, " +
                            usersChoice.toLowerCase() +
                            " beats " + computersChoice + "!");
                    wins++;
                }
            }

            System.out.println();
            System.out.print("Do you want to play again (y/n): ");
            another = scan.nextLine();
            System.out.println();

            while (! playAgain.contains(another))
            {
                System.out.print("Invalid Entry. Do you want to play again (y/n): ");
                another = scan.nextLine();
                System.out.println();
            }
        }

        int sum = wins + loses + ties;

        System.out.print("You played " + sum + " games: with " + wins);

        if (wins == 1)
            System.out.print(" win, " + loses);
        else
            System.out.print(" wins, " + loses);

        if (loses == 1)
            System.out.print(" lose, and " + ties);
        else
            System.out.print(" loses, and " + ties);

        if (ties == 1)
            System.out.println(" tie.");
        else
            System.out.println(" ties.");
    }
}

/*
* Design and implement an application that plays the Rock-Paper-
* Scissors game against the computer. When played between two
* people, each person picks one of three options(usually shown by
* a hand gesture) at the same time, and a winner determined. In
* the game, Rock beats Scissors, Scissors beats Paper, and Paper
* beats Rock. The program should randomly choose one of the
* three options(Without revealing it) and them prompt for the user's
* selection. At the point, the program reveals both choices and
* prints a statement indicating whether the user won, the computer
* won, or it was tie. Continue playing untill the user chooses to
* stop. Then print the number of user wins, and ties.
*/
