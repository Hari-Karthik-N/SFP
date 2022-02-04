package basicprogramming;

import java.util.Scanner;

public class Program42GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int result = 1;
        if(firstNumber == 0) result = secondNumber;
        else if(secondNumber == 0) result = firstNumber;
        else if(firstNumber == secondNumber) result = firstNumber;
        else {
            for(int i = 1; i < ((firstNumber >= secondNumber) ? secondNumber : firstNumber); i++) {
                if((firstNumber%i == 0) && (secondNumber%i == 0)) result = i;
            }
        }
        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + ": " + result);
    }
}
