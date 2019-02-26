import java.util.Scanner;

public class PP4_3 {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if(Num < 2){
            System.out.println("Error");
        }else{
            int result = 0;
            for(int i = 2; i <= Num; i += 2){
                result = result + i;
            }
            System.out.println(result);
        }
    }
}
/*
* Design and implement an application that reads an integer value
* and prints the sum of all even integers between 2 and  the input
* value, inclusive. Print an error message if the input value is less
* than 2. Prompt accordingly
*/