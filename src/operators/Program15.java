package operators;
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter x^2 Co-Efficient: ");
        int a = inp.nextInt();
        System.out.println("Enter x Co-Efficient: ");
        int b = inp.nextInt();
        System.out.println("Enter Constant: ");
        int c = inp.nextInt();
        int x1 = ((-b + (int)Math.sqrt((b*b) - (4*a*c))) / 2*a);
        int x2 = ((-b - (int)Math.sqrt((b*b) - (4*a*c))) / 2*a);
        System.out.println("factors: " + x1 + ", " + x2);
    }
}
