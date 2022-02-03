package basicprogramming;

public class Program44DisplayCharacters {
    public static void main(String[] args) {
        char alphabet = 'A';
        while(alphabet != ('Z' + 1)) {
            System.out.print(alphabet + " ");
            alphabet++;
        }
    }
}
