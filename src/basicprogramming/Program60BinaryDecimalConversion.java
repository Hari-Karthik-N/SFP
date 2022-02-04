package basicprogramming;

import java.util.Scanner;

public class Program60BinaryDecimalConversion {
    static int decimalToBinary(int theNumber) {
        String binaryStringReverse = "";
        while(theNumber!=0) {
            binaryStringReverse += (theNumber%2);
            theNumber /= 2;
        }
        String binaryString = "";
        for(int i = binaryStringReverse.length()-1; i >=0; i--) {
            binaryString += binaryStringReverse.charAt(i);
        }
        return Integer.parseInt(binaryString);
    }

    static int binaryToDecimal(int binary) {
        String binaryString = Integer.toString(binary);
        int decimal = 0;
        for(int i = binaryString.length()-1, j = 0; i >= 0; i--, j++) {
            decimal += Integer.parseInt(Character.toString(binaryString.charAt(i))) * (int)Math.pow(2, j);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal");
        int decimal = input.nextInt();
        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Enter the binary number: ");
        int binary = input.nextInt();
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
    }
}
