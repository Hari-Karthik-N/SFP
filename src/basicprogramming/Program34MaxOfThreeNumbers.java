package basicprogramming;

import java.util.Scanner;

public class Program34MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter Third Number: ");
        int thirdNumber = input.nextInt();
        System.out.println("Largest of the three numbers: " + ((firstNumber > secondNumber) ? (firstNumber > thirdNumber) ? firstNumber : thirdNumber : (secondNumber > thirdNumber) ? secondNumber : thirdNumber));
    }
}
