package basicprogramming;

import java.util.Scanner;

public class Program64PowerUsingRecursion {
    static int powerRecursion(int base, int exponent) {
        if(exponent == 0) return 1;
        if(exponent == 1) return base;
        return base * powerRecursion(base, exponent-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();
        System.out.println("ans: " + powerRecursion(base, exponent));
    }
}
