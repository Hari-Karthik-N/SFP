package basicprogramming;

import java.util.Scanner;

public class Program35RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x^2 Co-Efficient: ");
        int x2Coefficient = input.nextInt();
        System.out.println("Enter x Co-Efficient: ");
        int xCoefficient = input.nextInt();
        System.out.println("Enter Constant: ");
        int constant = input.nextInt();
        if (x2Coefficient == 0) {
            System.out.println("Factor: " + (-constant) + "/" + xCoefficient);
            return;
        }
        int factor1 = ((-xCoefficient + (int)Math.sqrt((xCoefficient*xCoefficient) - (4*x2Coefficient*constant))) / 2*x2Coefficient);
        int factor2 = ((-xCoefficient - (int)Math.sqrt((xCoefficient*xCoefficient) - (4*x2Coefficient*constant))) / 2*x2Coefficient);
        System.out.println("factors: " + factor1 + ", " + factor2);
    }
}
