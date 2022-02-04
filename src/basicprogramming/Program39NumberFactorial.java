package basicprogramming;

import java.util.Scanner;

public class Program39NumberFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for which factorial is to be found: ");
        int factorialNumber = input.nextInt();
        int factorialNumberAnswer = 1;
        if(factorialNumber == 0 || factorialNumber == 1) System.out.println("Factorial: " + factorialNumberAnswer);
        else {
            while(factorialNumber != 1) {
                factorialNumberAnswer = factorialNumberAnswer * factorialNumber;
                factorialNumber -= 1;
            }
            System.out.println("Factorial: " + factorialNumberAnswer);
        }
    }
}