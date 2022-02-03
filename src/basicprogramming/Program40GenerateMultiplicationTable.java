package basicprogramming;

import java.util.Scanner;

public class Program40GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiplicand: ");
        int multiplicand = input.nextInt();
        for(int i = 1;i<=10;i++) System.out.println(multiplicand + " * " + i + " = " + (multiplicand*i));
    }
}
