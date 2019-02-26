public class PP4_7 {
    public static void main(String arg[]) {
        for (int i = 100; i > 0; i--) {
            for (int j = 100-i; j >= 0; j--) {
                System.out.println(i + " bottles of beer on the wall");
            }
            System.out.println(i + " bottles of beer");
            System.out.println("if one of those bottles should happen to fall");
        }
    }
}

/*
* Design and implement an application that prints the first few
* verses of the traveling song "One hundred bottles of Beer." Use
* a loop such that each iteration prints one verse. Read the number
* of verse to print from the user. Validate the input. The following
* are the first rwo verses of the song.
* 100 bottles of beer on the wall
* 100 bottles of beer
* if one of those bottles should happen to fall
* 99 bottles of beer on the wall
* 99 bottles of beer on the wall
* if one of the bottles should happen to fall
* 98 bottles of beer on the wall
*/
