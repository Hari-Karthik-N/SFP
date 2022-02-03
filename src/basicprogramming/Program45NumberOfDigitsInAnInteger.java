package basicprogramming;

import java.util.Scanner;

public class Program45NumberOfDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        int integerLength = 0;
        while(theNumber != 0) {
            integerLength++;
            theNumber /= 10;
        }
        System.out.println("The number of digits in the integer is: " + integerLength);
    }
}
