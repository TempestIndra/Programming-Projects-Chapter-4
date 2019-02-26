public class PP4_10 {

    public static void main(String[] args)
    {
        final int MAX_ROWS = 10;
        for (int row =1; row <= MAX_ROWS; row++)
        {
            for(int star = MAX_ROWS-row; star>= 0; star--)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("");
        for (int row =1; row <= MAX_ROWS; row++)
        {
            for(int star = MAX_ROWS-row; star>= 0; star--)
                System.out.print(" ");
            for(int star = row; star > 0 ; star--)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("");
        for (int row =1; row <= MAX_ROWS; row++)
        {
            for(int star = row; star > 0 ; star--)
                System.out.print(" ");
            for(int star = MAX_ROWS-row; star>= 0; star--)
                System.out.print("*");

            System.out.println("");
        }
        System.out.println("");
        for (int row =0; row < MAX_ROWS/2; row++)
        {
            for(int space = MAX_ROWS/2 - row; space > 1 ; space--){
                System.out.print(" ");
            }
            for(int star = 1+(row*2); star> 0; star--)
                System.out.print("*");
            System.out.println("");
        }
        for (int row =4; row >= 0; row--)
        {
            for(int star = 1+(row*2); star> 0; star--)
                System.out.print("*");
            System.out.println("");
            for(int space = MAX_ROWS/2 - row; space > 0 ; space--){
                System.out.print(" ");
            }

        }
    }
}
/*
* Create modified version of the stars program to print the fol-
* lowing patterns, Create a separate program to produce each
* pattern. Hint: Parts b, c, and d require several loops, some of
* which print a specific number of spaces
*
* a.            b.              c.              d.
* **********             *      **********           *
* *********             **       *********          ***
* ********             ***        ********         *****
* *******             ****         *******        *******
* ******             *****          ******       *********
* *****             ******           *****       *********
* ****             *******            ****        *******
* ***             ********             ***         *****
* **             *********              **          ***
* *             **********               *           *
*/