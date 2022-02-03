package operators;
public class Program17 {
    public static void main(String[] args) {
        int a = 13;
        System.out.println("Unary minus (-):\n\tBefore: " + a + " After: " + (-a));
        System.out.println("Not operator (!):\n\tBefore: " + true + " After: " + (!true));
        System.out.println("Increment operator (++):\n\tPre-Increment:\n\t\tBefore: " + (a) + " After: " + (++a) + "\n\tPost-Increment:\n\t\tBefore: " + (a) + " After (on the same line): " + (a++));
        System.out.println("\t\t\t\t\t\t on the second line: " + a);
        System.out.println("Decrement operator (--):\n\tPre-Decrement:\n\t\tBefore: " + (a) + " After: " + (--a) + "\n\tPost-Decrement:\n\t\tBefore: " + (a) + " After (on the same line): " + (a--));
        System.out.println("\t\t\t\t\t\t on the second line: " + a);
        System.out.println("Bitwise Complement:\n\tBefore: " + (a) + " After: " + (~a));
    }
}
