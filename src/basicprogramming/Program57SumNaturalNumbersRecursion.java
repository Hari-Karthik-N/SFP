package basicprogramming;

import java.util.Scanner;

public class Program57SumNaturalNumbersRecursion {
    static int sumRecursion(int theNumber) {
        if(theNumber == 1) return 1;
        return theNumber + sumRecursion((theNumber-1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth natural number upto which sum is to be computed:");
        int theNumber = input.nextInt();
        System.out.println("the sum upto " + theNumber + " natural numbers is: " + sumRecursion(theNumber));
    }
}