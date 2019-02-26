import java.util.Scanner;
import java.io.*;

public class PP4_18 {
    public static void main(String [] args)throws IOException
    {
        Scanner file1 = new Scanner (new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 4\\src\\PP4_18input1.txt"));
        Scanner file2 = new Scanner (new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 4\\src\\PP4_18input2.txt"));

        while(file1.hasNextLine() || file2.hasNextLine()){
            String line1 = file1.nextLine();
            String line2 = file2.nextLine();

            if(line1.equals(line2)){

            }else{
                System.out.println("Lines not equal: " );
                System.out.println("Line 1: " + line1 );
                System.out.println("Line 2: " + line2);
            }
        }
    }
}

/*
* Design and implement a program that compares two input
* files, line by line, for equality. Print any lines that are not equivalent
*/