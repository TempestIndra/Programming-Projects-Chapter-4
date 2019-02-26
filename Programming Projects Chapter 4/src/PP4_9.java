import java.util.Scanner;

public class PP4_9 {
    public static void main (String arg[]){

        String str, another = "y";
        int left,right;

        Scanner scan = new Scanner(System.in);

        while(another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a potential palindrome:");
            str = scan.nextLine();

            str = str.toLowerCase();
            str = str.replaceAll("\\s", "");
            str = str.replaceAll("\\p{Punct}", "");

            left = 0;
            right = str.length() -1;

            while(str.charAt(left) == str.charAt(right) && left<right)
            {
                left++;
                right--;
            }

            System.out.println();
            if(left<right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string Is a palindrome");
            System.out.println();
            System.out.print("Test another palindrome (y/n) ");
            another = scan.nextLine();

        }
    }
}


/*
* Create a modified version of the PalindromeTester program
* so that the spaces, punctuation, and changes in uppercase and
* lowercase are not considered when determining whether a
* string is a palindrome. Hint: These issues can be handled in
* several ways. Think carefully about your design.
*
*
*
* */
