package homeworks;

import java.util.Scanner;

public class VowelsAndConsonants {

    /*
    1. Create a class with main method and Scanner
    2. Write a code where program will ask from user to enter a letter,
    and program will print Vowel if letter is vowel otherwise Consonant. (Vowel letters: a, e, u, i, o, A, E, U, I, O)

        (Bold parts are user entry.)

Example 1:
Please enter the character:
a
It is a Vowel

Example 2:
Please enter the character:
T
It is a Consonant
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a letter pls : ");
        String letter = scan.next();

        checkCharacter(letter);

    }

    public static void checkCharacter(String letter){
        boolean isVowel = false;
        String[] letters = {"a","e","u","i","o","A","E","U","I","O"};

        for (int i = 0; i < letters.length; i++) {
            if(letter.equalsIgnoreCase(letters[i])) isVowel=true;
        }
        if(isVowel) System.out.println("It is a vowel");
        else System.out.println("It is a constant");
    }
}
