public class PP4_14 {
    public static void main(String[] args){
        String day = "";
        for(int i = 1;i<=12;i++){
            switch(i)
            {
                case 12:
                    day = "12th";
                    break;
                case 11:
                    day = "11th";
                    break;
                case 10:
                    day = "10th";
                    break;
                case 9:
                    day = "9th";
                    break;
                case 8:
                    day = "8th";
                    break;
                case 7:
                    day = "7th";
                    break;
                case 6:
                    day = "6th";
                    break;
                case 5:
                    day = "5th";
                    break;
                case 4:
                    day = "4th";
                    break;
                case 3:
                    day = "3rd";
                    break;
                case 2:
                    day = "2nd";
                    break;
                case 1:
                    day = "1st";
            }
            System.out.println("On "+day+" day of christmas my true love gave to me");
            switch(i)
            {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a milking,");
                case 7:
                    System.out.println("Seven swans a swimming,");
                case 6:
                    System.out.println("Six geese a laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                case 1:
                    System.out.println("A partridge in a pear tree");
            }
        }

    }
}


/*
* Design and implement an application that prints the verses of the
* song "The Twelve days of Christmas," in which each verse adds
* one line the first two verse of the song are
* On 1st day of christmas my true love gave to me
* A partridge in a pear tree.
* On 2nd day of Christmas my true love gave to me
* Two turtle doves, and
* A partridge in a pear tree
* Use a switch statement in a loop to control which lines get
* printed. Hint: Order the cases carefully and avoid the break state-
* ment. Use a separate switch statement to put the appropriate suf-
* fix on the day number (1st, 2nd, 3rd, etc.). The final verse of the
* song involves all 12 days, as follows:
* One the 12th day of Christmas, my true love gave to me
* Twelve drummers drumming,
* Eleven pipers piping,
* Ten lords a leaping,
* Nine ladies dancing,
* Eight maids a milking,
* Seven swans a swimming,
* Six geese a laying,
* Five golden rings,
* Four calling birds,
* Three French hens,
* Two turtle doves, and
* A partridge in a pear tree
*/