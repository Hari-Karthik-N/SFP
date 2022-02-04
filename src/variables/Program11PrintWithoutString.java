package variables;

import java.util.Scanner;

public class Program11PrintWithoutString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 7.50: ");
        float userInput = input.nextFloat();
        System.out.printf("Printing without using String: %.2f", userInput);
    }
}
