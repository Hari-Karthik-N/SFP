package operators;
public class Program18 {
    public static void main(String[] args) {
        int a = 5, b = 13, c = 7;
        System.out.println("Maximum of the three numbers(a=5,b=13.c=7): " + ((a > b) ? (a > c) ? a : c : (b > c) ? b : c));
    }
}