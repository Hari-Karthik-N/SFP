package basicprogramming;

import java.util.Scanner;

public class Program54PrimeNumberIntervals {
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
        System.out.println("Enter the interval from and to: ");
        int from = input.nextInt();
        int to = input.nextInt();
        System.out.println("Prime Numbers between " + from + " - " + to + " :");
        for(int start = from; start <= to;start++) {
            if(isPrime(start)) System.out.print(start + " ");
        }
    }
}
