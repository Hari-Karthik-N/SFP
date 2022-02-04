package basicprogramming;

import java.util.Scanner;

public class Program51ArmstrongNumberBetweenIntervals {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the interval from and to: ");
        int from = input.nextInt();
        int to = input.nextInt();
        for(int currentNumber = from;currentNumber<=to;currentNumber++) {
            int temporaryNumberHolder = currentNumber;
            int integerLength = 0;
            while(temporaryNumberHolder != 0) {
                integerLength++;
                temporaryNumberHolder /= 10;
            }
            temporaryNumberHolder = currentNumber;
            int armstrongNumberCheck = 0;
            while(temporaryNumberHolder != 0) {
                armstrongNumberCheck += (int)Math.pow(temporaryNumberHolder%10,integerLength);
                temporaryNumberHolder /= 10;
            }
            if(currentNumber == armstrongNumberCheck) System.out.println(currentNumber + " is an Armstrong Number");
        }

    }
}
