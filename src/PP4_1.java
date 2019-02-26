import java.util.Scanner;

public class PP4_1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year < 1582){
            System.out.println("Error");
        } else {
            if(year % 4 == 0){
                if( year % 100 == 0){
                    if ( year % 400 == 0) {
                        System.out.println("Leap year");
                    }else{
                        System.out.println("not Leap year");
                    }
                }
                else{
                    System.out.println("Leap year");
                }
            }
            else {
                System.out.println("not Leap year");
            }
        }
        sc.close();
    }
}

/*
*  Design and implement an application that reads an integer value
*  representing a year from the user. The purpose of the program is
*  to determine whether the year is a leap year (and therefore has 29
*  days in February) in the Gregorian calendar. A year is a leap year if
*  it is divisible by 4, unless it is also divisible by 100 but not 400. For
*  example, the year 2003 is not a leap year, but 2004 is. The year
*  1900 is not a leap year because it divisible by 100, but the year
*  2000 is a leap year because even though it is divisible by 100, it is
*  also divisible by 400. Produce an error message for any input value
*  less than 1582( the year the Gregorian calendar was adopted)
*/
