package basicprogramming;

import java.util.Scanner;

public class Program33VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char vowelOrConsonant = input.next().charAt(0);
        System.out.println("The character is: " + ((vowelOrConsonant == 'a' || vowelOrConsonant == 'e' || vowelOrConsonant == 'i' || vowelOrConsonant == 'o' || vowelOrConsonant == 'u') ? "A Vowel" : "A Consonant"));
    }
}
