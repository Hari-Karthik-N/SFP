package operators;

public class Program24 {
    public static void main(String[] args) {
        int y = 10;
        int z = (++y * (y++ + 5));
        System.out.println("z: " + z);
    }
}
