package basicprogramming;

import java.util.Scanner;

public class Program61OctalDecimalConversion {
    static boolean isOctalValid(int octal) {
        String octalToString = Integer.toString(octal);
        if(octalToString.contains("8") || octalToString.contains("9")) return false;
        return true;
    }
    static int octalTODecimal(int octal) {
        String octalString = Integer.toString(octal);
        int decimal = 0;
        for(int i = octalString.length()-1, j = 0; i >= 0; i--, j++) {
            decimal += Integer.parseInt(Character.toString(octalString.charAt(i))) * (int)Math.pow(8, j);
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
        System.out.println("Enter the Octal number");
        int octal = input.nextInt();
        if(!isOctalValid(octal)) {
            System.out.println("Not a valid octal number!");
            return;
        }
        System.out.println("Octal to Decimal: " + octalTODecimal(octal));
        System.out.println("Enter the Decimal number: ");
        int decimal = input.nextInt();
        System.out.println("Decimal to Octal: " + decimalToOctal(decimal));
    }
}
