package basicprogramming;

import java.util.Scanner;

public class Program55PrimeOrArmstrong {
    static boolean isPrime(int theNumber) {
        if(theNumber <= 1) return false;
        if(theNumber == 2) return true;
        for(int i = 2;i<=((theNumber) / 2);i++) {
            if (theNumber % i == 0) return false;
        }
        return true;
    }
    static boolean isArmstrong(int theNumber) {
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
        if(theNumber == armstrongNumberCheck) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        if((isPrime(theNumber)) && (isArmstrong(theNumber))) System.out.println(theNumber + " is both prime and armstrong");
        else if(isPrime(theNumber)) System.out.println(theNumber + " is a prime number");
        else if(isArmstrong(theNumber)) System.out.println(theNumber + " is an armstrong number");
        else System.out.println(theNumber + " is neither an armstrong number nor an prime number");
    }
}
