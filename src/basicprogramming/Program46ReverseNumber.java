package basicprogramming;

import java.util.Scanner;

public class Program46ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int theNumber = input.nextInt();
        System.out.println("the reversed version of the number " + theNumber + " is: ");
        while(theNumber != 0) {
            System.out.print(theNumber%10);
            theNumber /= 10;
        }
    }
}
