package pyramidpattern;

import java.util.Scanner;

public class PyramidPattern5 {
    static void printPattern5(int rows) {
        int spaceToBeLeft = rows;
        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < spaceToBeLeft; j++) System.out.print("  ");
            for(int j = rows; j >= spaceToBeLeft; j--) System.out.print(j + " ");
            for(int j = spaceToBeLeft+1; j <= rows; j++) System.out.print(j + " ");
            System.out.println();
            spaceToBeLeft--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed: ");
        int rows = input.nextInt();
        printPattern5(rows);
    }
}
