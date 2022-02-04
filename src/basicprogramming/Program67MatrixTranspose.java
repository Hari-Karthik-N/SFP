package basicprogramming;

import java.util.Scanner;

public class Program67MatrixTranspose {
    static int[][] matrixTranspose(int[][] theMatrix) {
        int[][] matrixTranspose = new int[theMatrix[0].length][theMatrix.length];
        for(int i = 0, k = 0; i < theMatrix.length; i++, k++) {
            for(int j = 0, l = 0; j < theMatrix[0].length; j++, l++) {
                matrixTranspose[l][k] = theMatrix[i][j];
            }
        }
        return matrixTranspose;
    }

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the martrix: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] theMatrix = new int[rows][columns];
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                theMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(theMatrix);
        System.out.println("The transpose is: ");
        printMatrix(matrixTranspose(theMatrix));
    }
}
