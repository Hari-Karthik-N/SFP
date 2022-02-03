package basicprogramming;

import java.util.Scanner;

public class Program43LCMOfTwoNumbers {
    static int findGCD(int firstNumber, int secondNumber) {
        if(firstNumber == 0) return secondNumber;
        if(secondNumber == 0) return firstNumber;
        if(firstNumber == secondNumber) return firstNumber;
        if(firstNumber > secondNumber) return findGCD((firstNumber - secondNumber), secondNumber);
        return findGCD(firstNumber, (secondNumber - firstNumber));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int GCD = findGCD(firstNumber,secondNumber);
        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + ": " + ((firstNumber * secondNumber)/GCD));
    }
}
