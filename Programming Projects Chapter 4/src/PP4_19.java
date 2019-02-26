import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP4_19 {
    public static void main(String[] arg) throws FileNotFoundException {

        Scanner file = new Scanner(new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 4\\src\\PP4_19.txt"));

        int periodCount = 0;
        int commaCount = 0;
        int semicolonCount = 0;
        int colonCount = 0;
        int exclamationCount = 0;
        int questionCount = 0;
        int total = 0;

        while(file.hasNextLine()){
            String s = file.nextLine();
            for(int i = 0; i < s.length(); i++)
            {
                switch(s.charAt(i)) {
                    case '.':
                        periodCount++;
                        total++;
                        break;
                    case ',':
                        commaCount++;
                        total++;
                        break;
                    case ';':
                        semicolonCount++;
                        total++;
                        break;
                    case ':':
                        colonCount++;
                        total++;
                        break;
                    case '!':
                        exclamationCount++;
                        total++;
                        break;
                    case '?':
                        questionCount++;
                        total++;
                        break;
                }
            }
        }

        System.out.println("There are total of " + total + " punctuation");
        System.out.println("There are " + periodCount + " periods in this String.");
        System.out.println("There are " + commaCount + " commas in this String.");
        System.out.println("There are " + semicolonCount + " semicolons in this String.");
        System.out.println("There are " + colonCount + " colons in this String.");
        System.out.println("There are " + exclamationCount + " exclamation marks in this String.");
        System.out.println("There are " + questionCount + " quesiton marks in this String.");

    }
}

/*
* Design and implement a program that counts the number of
* punctuation marks in a text input file. Produce a table that shows
* how many times each symbol occur
* */