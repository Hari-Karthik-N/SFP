package basicprogramming;

import java.util.Scanner;

public class Program41FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number to be generated in the fibonacci series: ");
        int nthFibonacciNumber = input.nextInt();
        if(nthFibonacciNumber == 1) System.out.println("fibonacci series: 0");
        if(nthFibonacciNumber == 2) System.out.println("fibonacci series: 0 1");
        else {
            System.out.print("fibonacci series: 0 1");
            int previousNumber = 0, presentNumber = 1;
            while(nthFibonacciNumber != 0) {
                int nextNumber = (previousNumber+presentNumber);
                System.out.print(" " + nextNumber);
                previousNumber = presentNumber;
                presentNumber = nextNumber;
                nthFibonacciNumber--;
            }
        }
    }
}