package basicprogramming;
import java.util.Scanner;
public class Program31SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("swapping with a temporary variable...");
        int temporaryNumberHolder = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryNumberHolder;
        System.out.println("After swapping with a temporary variable, first number: " + firstNumber + ", second number: " + secondNumber);
        System.out.println("Swapping back without a temporary variable...");
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("After Swapping back without a temporary variable, first number: " + firstNumber + ", second number: " + secondNumber);
    }
}
