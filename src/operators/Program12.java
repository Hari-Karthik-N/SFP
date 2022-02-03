package operators;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the side length: ");
        int side = inp.nextInt();
        System.out.println("The Area of the square whose side is " + side + " = " + (side * side));
    }
}
