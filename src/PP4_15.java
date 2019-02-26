import java.util.Scanner;

public class PP4_15 {
    public static void main(String[] args){
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop)
        {
            int randomNum1 = (int)(Math.random()*10);
            int randomNum2 = (int)(Math.random()*10);
            int randomNum3 = (int)(Math.random()*10);
            if(randomNum1 == randomNum2 && randomNum2==randomNum3){
                System.out.println("Three of the numbers are the same");
            }else if(randomNum1 == randomNum2 || randomNum1 == randomNum3 || randomNum2 == randomNum3){
                System.out.println("two of the numbers are the same");
            }else{
                System.out.println("None of the number are the same");
            }
            System.out.println("Here is all the random number " + randomNum1 +" " +randomNum2+" " + randomNum3);
            System.out.println("Would you like to try again? y/n");
            String answer = sc.nextLine().toLowerCase();
            if(answer.equals("n")){
                loop = false;
            }


        }




    }
}

/*
* Design and implement an applicationt hat simulates a simple
* slot machine in which three numbers between 0 and 9 are ran-
* domly selected and printed side by side print an appropriate
* statement if all three of the numbers are the same or if any two
* of the numbers are the same. Continue playing until the user
* choose stop
*/
