package basicprogramming;

import java.util.Scanner;

public class Program62BinaryOctalConversion {
    static int octalTODecimal(int octal) {
        String octalString = Integer.toString(octal);
        int decimal = 0;
        for(int i = octalString.length()-1, j = 0; i >= 0; i--, j++) {
            decimal += Integer.parseInt(Character.toString(octalString.charAt(i))) * (int)Math.pow(8, j);
        }
        return decimal;
    }

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

    static int decimalToOctal(int decimal) {
        String octalStringReverse = "";
        while(decimal!=0) {
            octalStringReverse += (decimal%8);
            decimal /= 8;
        }
        String octalString = "";
        for(int i = octalStringReverse.length()-1; i >=0; i--) {
            octalString += octalStringReverse.charAt(i);
        }
        return Integer.parseInt(octalString);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the octal");
        int octal = input.nextInt();
        int decimal = octalTODecimal(octal);
        System.out.println("Octal to Binary: " + decimalToBinary(decimal));
        System.out.println("Enter the binary number: ");
        int binary = input.nextInt();
        int decimalFromBinary = binaryToDecimal(binary);
        System.out.println("Binary to Octal: " + decimalToOctal(decimalFromBinary));
    }
}
