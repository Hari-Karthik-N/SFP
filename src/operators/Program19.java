package operators;

public class Program19 {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        System.out.println("a: " + a + " b: "+ b);
        System.out.println("Bitwise OR (a|b): " + (a|b));
        System.out.println("Bitwise AND (a&b): " + (a|b));
        System.out.println("Bitwise XOR (a^b): " + (a|b));
        System.out.println("Bitwise Complement (-a): " + (~a));
        System.out.println("Signed Right shift operator (>>): " + (a>>1));
        System.out.println("Unsigned Right shift operator (>>>): " + (a>>>1));
        System.out.println("Signed Left shift operator (<<): " + (a<<1));
    }
}
