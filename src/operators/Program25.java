package operators;

public class Program25 {
    public static void main(String[] args) {
        int x = 5;
        int x1 = ++x - x++ + --x;
        System.out.println("X1: " + x1);
    }
}
