package basicprogramming;

import java.util.Scanner;

public class Program48NumberPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        int temporaryNumberHolder = theNumber;
        String reverseNumberString = "";
        while(temporaryNumberHolder != 0) {
            reverseNumberString += temporaryNumberHolder%10;
            temporaryNumberHolder /= 10;
        }
        int reversedNumber = Integer.parseInt(reverseNumberString);
        System.out.println((theNumber == reversedNumber) ? "palindrome" : "not a palindrome");
    }
}
