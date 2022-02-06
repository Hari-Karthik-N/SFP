package basicprogramming;

import java.util.Scanner;

public class Program37IsAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char isAlphabet = input.next().charAt(0);
        System.out.println("the character is: " + (((isAlphabet >= 'a' && isAlphabet <= 'z') || (isAlphabet >= 'A' && isAlphabet <= 'Z')) ? "An Alphabet" : "Not an Alphabet"));
    }
}
