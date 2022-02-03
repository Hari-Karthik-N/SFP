package basicprogramming;

import java.util.Scanner;

public class Program35RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x^2 Co-Efficient: ");
        int x2Coefficient = input.nextInt();
        System.out.println("Enter x Co-Efficient: ");
        int xcoefficient = input.nextInt();
        System.out.println("Enter Constant: ");
        int constant = input.nextInt();
        int factor1 = ((-xcoefficient + (int)Math.sqrt((xcoefficient*xcoefficient) - (4*x2Coefficient*constant))) / 2*constant);
        int factor2 = ((-xcoefficient - (int)Math.sqrt((xcoefficient*xcoefficient) - (4*x2Coefficient*constant))) / 2*constant);
        System.out.println("factors: " + factor1 + ", " + factor2);
    }
}
