package operators;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = inp.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = inp.nextInt();
        System.out.println("The Area of the rectangle whose length is " + length + ", and breadth is " + breadth + " = "
                + (length * breadth));
    }
}