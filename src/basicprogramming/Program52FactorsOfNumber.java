package basicprogramming;

import java.util.Scanner;

public class Program52FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        System.out.println("Factors of " + theNumber + " :");
        for(int i = 1;i<=(int)Math.sqrt(theNumber);i++) {
            if(theNumber % i == 0) {
                if(theNumber/i == i) System.out.print(i + " ");
                else System.out.print(i + " " + theNumber/i + " ");
            }
        }
    }
}
