package basicprogramming;

import java.util.Scanner;

public class Program29QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter Divisor: ");
        int divisor = input.nextInt();
        System.out.println("Quotient: " + (dividend/divisor) + " Remainder: " + (dividend%divisor));
    }
}
