package basicprogramming;
import java.util.Scanner;
public class Program28FindAsciiValueOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char character = input.next().charAt(0);
        System.out.println("Ascii value of " + character + " is: " + (int)character);
    }
}
