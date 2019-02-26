import java.util.Scanner;

public class PP4_4 {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i ++){
            System.out.println(word.charAt(i));
        }
    }
}

/*
* Design and implement an application that reads a string from the
* user and prints it one character per line
*/
