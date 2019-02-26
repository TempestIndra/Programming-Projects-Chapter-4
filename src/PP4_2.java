import java.util.Scanner;

public class PP4_2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Boolean stop = true;
        while (stop) {
            int year = sc.nextInt();
            if(year == 2) {
                stop = false;
            }else if (year < 1582) {
                System.out.println("Error");
            } else {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("Leap year");
                        } else {
                            System.out.println("not Leap year");
                        }
                        } else {
                            System.out.println("Leap year");
                        }
                    } else {
                        System.out.println("not Leap year");
                    }
                }

            }
            sc.close();
        }
    }

/*
* Modify the solution to Programing Project 4.1 so that hte user
* can evaluate multiple years.Allow the user to terminate the pro-
* game using an appropriate sentinel value. Validate each input
* value to ensure that it is greater than or equal to 1582
*/
