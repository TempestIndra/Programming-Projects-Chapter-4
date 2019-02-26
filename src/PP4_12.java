import java.util.Scanner;

public class PP4_12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int nonVowel =0, a =0, e = 0, i =0, u=0,o=0;
        word = word.toLowerCase();
        for(int j = 0; i < word.length(); i ++){
            char letter = word.charAt( j );
            if(letter == 'a'){
                a++;
            }else if(letter == 'e'){
                e++;
            }else if(letter == 'i'){
                i++;
            }else if(letter == 'o'){
                o++;
            }else if(letter == 'u'){
                u++;
            }else{
                nonVowel++;
            }
        }
        System.out.println("a: " + a + " e: " + e + " i: " + i + " o: " + o + " u: " + u + " non vowel: " + nonVowel);
    }
}


/*
* Design and implement an applicationt hat reads a string from the
* user and then determine and prints how many of each lowercase
* vowel(a,e,i,o,and u) appear in the entire string. Have a separate
* counter for each vowel. Also count and print the number of non-vowel
*/