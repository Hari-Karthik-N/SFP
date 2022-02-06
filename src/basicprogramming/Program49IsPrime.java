package basicprogramming;

import java.util.Scanner;

public class Program49IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int theNumber = input.nextInt();
        if(theNumber <= 1) {
            System.out.println("Composite number");
            return;
        }
        if(theNumber == 2) {
            System.out.println("Prime Number");
            return;
        }
        for(int i = 2;i<=((theNumber) / 2);i++) {
            if (theNumber % i == 0) {
                System.out.println("Composite Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
