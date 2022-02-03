package operators;

public class Program23 {
    public static void main(String[] args) {
        int x = 27;
        x = x++ * 2 + 3 * --x;
        System.out.println("x: " + x);
    }
}
