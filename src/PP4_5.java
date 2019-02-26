import java.util.Scanner;

public class PP4_5 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int odd = 0,even = 0, zero = 0;
        while(number > 0){
            if ((number % 10)==0) zero++;
            else if (number%2==0) even++;
            else odd++;
            number /= 10;
        }
        System.out.print("Even: "+even+" Odd: "+odd+" Zero: "+zero);
    }
}
/*
* Design and implement an application that determine and prints
* the number of odd, even, and zero digits in an integer value read
* from the keyboard
*/