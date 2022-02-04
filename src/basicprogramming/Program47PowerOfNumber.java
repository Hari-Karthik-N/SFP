package basicprogramming;

import java.util.Scanner;

public class Program47PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();
        if(exponent == 0) {
            System.out.println("The final answer: " + 1);
            return;
        }
        if(exponent == 1) {
            System.out.println("The final answer: " + theNumber);
            return;
        }
//        System.out.println("using while loop:");
//        int answer = 1;
//        while(exponent != 0) {
//            answer = answer * theNumber;
//            exponent--;
//        }
//        System.out.println("The Final Answer: " + answer);
        System.out.println("The final answer is: " + (int)Math.pow(theNumber,exponent));
    }
}
