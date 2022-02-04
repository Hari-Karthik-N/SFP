package basicprogramming;

import java.util.Scanner;

public class Program58FactorialRecursion {
    static int factorialRecursion(int theNumber) {
        if(theNumber == 0) return 1;
        if(theNumber == 1) return 1;
        return theNumber * factorialRecursion(theNumber - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        System.out.println("the factorial of " + theNumber + " is: " + factorialRecursion(theNumber));
    }
}
