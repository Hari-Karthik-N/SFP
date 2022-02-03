package operators;

public class Program22 {
    public static void main(String[] args) {
        int a = 28;
        a += a++ + ++a + --a + a--;
        System.out.println(a);
    }
}