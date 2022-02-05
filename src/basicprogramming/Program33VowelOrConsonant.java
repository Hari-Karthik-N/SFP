package basicprogramming;

import java.util.Scanner;

public class Program33VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char vowelOrConsonant = input.next().charAt(0);
        String vowels = "aeiouAEIOU";
        for(int i = 0;i<vowels.length();i++) {
            if(Character.toString(vowelOrConsonant).contains(Character.toString(vowels.charAt(i)))) {
                System.out.println(vowelOrConsonant + " is a vowel");
                return;
            }
        }
        System.out.println(vowelOrConsonant + " is a consonant");
    }
}
