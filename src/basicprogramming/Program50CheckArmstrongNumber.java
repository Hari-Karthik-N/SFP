package basicprogramming;

import java.util.Scanner;

public class Program50CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        int temporaryNumberHolder = theNumber;
        int integerLength = 0;
        while(temporaryNumberHolder != 0) {
            integerLength++;
            temporaryNumberHolder /= 10;
        }
        temporaryNumberHolder = theNumber;
        int armstrongNumberCheck = 0;
        while(temporaryNumberHolder != 0) {
            armstrongNumberCheck += (int)Math.pow(temporaryNumberHolder%10,integerLength);
            temporaryNumberHolder /= 10;
        }
        if(theNumber == armstrongNumberCheck) System.out.println("Armstrong Number");
        else System.out.println("Not an armstrong number");
    }
}
