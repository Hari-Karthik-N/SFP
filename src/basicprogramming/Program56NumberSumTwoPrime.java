package basicprogramming;

import java.util.Scanner;

public class Program56NumberSumTwoPrime {
    static boolean isPrime(int theNumber) {
        if(theNumber <= 1) return false;
        if(theNumber == 2) return true;
        for(int i = 2;i<=((theNumber) / 2);i++) {
            if (theNumber % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        boolean canBeExpressed = false;
        for(int firstPrime = 2;firstPrime <= (theNumber/2);firstPrime++) {
            if(isPrime(firstPrime)) {
                if(isPrime((theNumber - firstPrime))) {
                    canBeExpressed = true;
                    System.out.println(theNumber + " can be expressed as a sum of two primes as: " + firstPrime + " + " + (theNumber - firstPrime));
                }
            }
        }
        if(!canBeExpressed) System.out.println(theNumber + " cannot be expressed as a sum of two primes!");
    }
}
