package basicprogramming;
import java.util.Scanner;
public class Program27LeapYearOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        if(year % 4 == 0) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}