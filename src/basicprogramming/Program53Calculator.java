package basicprogramming;

import java.util.Scanner;

public class Program53Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operand1, operand2;
        boolean exit = false;
        while(!exit) {
            System.out.println("Enter the operation you want to perform (+,-,*,/) (e - for exit): ");
            char operation = input.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println("enter the operand1: ");
                    operand1 = input.nextInt();
                    System.out.print("+ ");
                    System.out.println(" enter the operand2: ");
                    operand2 = input.nextInt();
                    System.out.println("Result: " + (operand1 + operand2));
                    break;
                case '-':
                    System.out.println("enter the operand1: ");
                    operand1 = input.nextInt();
                    System.out.print(" - ");
                    System.out.println("enter the operand2: ");
                    operand2 = input.nextInt();
                    System.out.println("Result: " + (operand1 - operand2));
                    break;
                case '*':
                    System.out.println("enter the operand1: ");
                    operand1 = input.nextInt();
                    System.out.print(" * ");
                    System.out.println("enter the operand2: ");
                    operand2 = input.nextInt();
                    System.out.println("Result: " + (operand1 * operand2));
                    break;
                case '/':
                    System.out.println("enter the operand1: ");
                    operand1 = input.nextInt();
                    System.out.print(" / ");
                    System.out.println("enter the operand2: ");
                    operand2 = input.nextInt();
                    System.out.println("Result: " + (operand1 / operand2));
                    break;
                case 'e':
                    System.out.println("exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("please choose a correct option");
                    break;
            }
        }

    }
}
