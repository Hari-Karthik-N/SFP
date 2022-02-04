package pyramidpattern;

import java.util.Scanner;

public class PyramidPattern2 {
    static void printPattern2(int rows) {
        int spaceToBeLeft = rows;
        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < spaceToBeLeft; j++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
            spaceToBeLeft--;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed: ");
        int rows = input.nextInt();
        printPattern2(rows);
    }
}
