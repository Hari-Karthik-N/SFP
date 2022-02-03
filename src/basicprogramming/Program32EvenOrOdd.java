package basicprogramming;

import java.util.Scanner;

public class Program32EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int evenOrOdd = input.nextInt();
        System.out.println("The number is: " + (evenOrOdd%2==0 ? "Even" : "Odd"));
    }
}