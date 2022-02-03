package basicprogramming;

import java.util.Scanner;

public class Program36PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int positiveOrNegative = input.nextInt();
        System.out.println("The number is: " + ((positiveOrNegative >= 0) ? "Positive" : "Negative"));
    }
}
