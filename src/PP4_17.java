import java.util.Scanner;
import java.io.*;

public class PP4_17
{
    public static void main (String[] args) throws IOException
    {
        int Golfer1, Golfer2, Golfer3, Golfer4, par;
        int totalGolfer1=0, totalGolfer2=0, totalGolfer3=0, totalGolfer4=0, totalpar=0;


        Scanner fileScan = new Scanner (new File("C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 4\\src\\PP4_17.txt"));

        for(int i = 1; i <= 18;i++)
        {

            int number = fileScan.nextInt();
            par = Integer.parseInt(Integer.toString(number).substring(0, 1));
            Golfer1 = Integer.parseInt(Integer.toString(number).substring(1, 2));
            Golfer2 = Integer.parseInt(Integer.toString(number).substring(2, 3));
            Golfer3 = Integer.parseInt(Integer.toString(number).substring(3, 4));
            Golfer4 = Integer.parseInt(Integer.toString(number).substring(4, 5));

            totalpar += par;
            totalGolfer1 += Golfer1;
            totalGolfer2 += Golfer2;
            totalGolfer3 += Golfer3;
            totalGolfer4 += Golfer4;

            System.out.println("Hole: " + i);
            System.out.println("Par: " + par);
            System.out.println("Golfer 1: " + (Golfer1 - par));

            System.out.println("Golfer 2: " + (Golfer2 - par));

            System.out.println("Golfer 3: " + (Golfer3 - par));

            System.out.println("Golfer 4: " + (Golfer4 - par));
            System.out.println();

        }

        System.out.println("Par is: " + totalpar);
        System.out.println();
        System.out.println("Golfer 1 scored: " + totalGolfer1);
        System.out.println("Golfer 2 scored: " + totalGolfer2);
        System.out.println("Golfer 3 scored: " + totalGolfer3);
        System.out.println("Golfer 4 scored: " + totalGolfer4);


        System.out.println();
        int small = totalGolfer4;
        if (small > totalGolfer1)
            small = totalGolfer1;
        if (small > totalGolfer2)
            small = totalGolfer2;
        if (small > totalGolfer3)
            small = totalGolfer3;

        if (small == totalGolfer1)
            System.out.println("Golfer 1 is the winner!");
        if (small == totalGolfer2)
            System.out.println("Golfer 2 is the winner!");
        if (small == totalGolfer3)
            System.out.println("Golfer 3 is the winner!");
        if (small == totalGolfer4)
            System.out.println("Golfer 4 is the winner!");

        System.out.println();
        int large = totalGolfer4;
        if (large < totalGolfer1)
            large = totalGolfer1;
        if (large < totalGolfer2)
            large = totalGolfer2;
        if (large < totalGolfer3)
            large = totalGolfer3;

        if (large == totalGolfer1)
            System.out.println("Golfer 1 loses.");
        if (large == totalGolfer2)
            System.out.println("Golfer 2 loses.");
        if (large == totalGolfer3)
            System.out.println("Golfer 3 loses.");
        if (large == totalGolfer4)
            System.out.println("Golfer 4 loses.");

    }
}

/*
* Design and implement a program to process gold scores. The
* scores of four golfers are stored in a text file. Each line represents
* one hole, and the file contains 18 lines. Each line contains five
* values: par for the hole followed by the number of strokes each
* golfer used on that hole. Determine the winner and produce a
* table showing how well each golfer did (compare to par).
*/