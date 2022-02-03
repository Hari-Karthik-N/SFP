package operators;
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter radius of first circle: ");
        int r1 = inp.nextInt();
        System.out.println("Enter radius of second circle: ");
        int r2 = inp.nextInt();
        System.out.println("Space between the two concentric circles: " + ((3.14f*r2*r2) - (3.14f*r1*r1)));
    }
}
