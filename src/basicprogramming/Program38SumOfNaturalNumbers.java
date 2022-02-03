package basicprogramming;

import java.util.Scanner;

public class Program38SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter upto which natural number should compute the sum: ");
        int nthNaturalNumber = input.nextInt();
        System.out.println("The sum upto " + nthNaturalNumber + " is: " + (((nthNaturalNumber)*(nthNaturalNumber+1))/2));
    }
}
