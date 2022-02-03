package operators;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter height: ");
        float height = inp.nextFloat();
        System.out.println("enter radius: ");
        float radius = inp.nextFloat();
        System.out.println("area: " + (2f * 3.14f * radius * (height + radius)));
    }
}
