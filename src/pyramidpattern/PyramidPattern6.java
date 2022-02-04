package pyramidpattern;

import java.util.Scanner;

public class PyramidPattern6 {
    static void printPattern6(int rows) {
        int spaceToBeLeft = 0;
        for(int i = rows; i >= 1; i--) {
            for(int j = 0; j < spaceToBeLeft; j++) System.out.print(" ");
            for(int j = i; j >= 1; j--) System.out.print("* ");
            System.out.println();
            spaceToBeLeft++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed: ");
        int rows = input.nextInt();
        printPattern6(rows);
    }
}
