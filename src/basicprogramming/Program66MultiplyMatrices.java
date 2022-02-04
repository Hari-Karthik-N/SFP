package basicprogramming;

import java.util.Scanner;

public class Program66MultiplyMatrices {
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
        System.out.println("Enter first matrix rows and columns: ");
        int firstMatrixRows = input.nextInt();
        int firstMatrixColumns = input.nextInt();
        System.out.println("Enter second matrix rows and columns: ");
        int secondMatrixRows = input.nextInt();
        int secondMatrixColumns = input.nextInt();
        if(firstMatrixColumns != secondMatrixRows) {
            System.out.println("Invalid dimensions to print the matrix!");
            return;
        }
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixColumns];
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixColumns];
        System.out.println("Enter first matrix: ");
        for(int i = 0; i < firstMatrixRows; i++) {
            for(int j = 0; j < firstMatrixColumns; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for(int i = 0; i < secondMatrixRows; i++) {
            for(int j = 0; j < secondMatrixColumns; j++) {
                secondMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("First Matrix: ");
        printMatrix(firstMatrix);
        System.out.println("Second Matrix: ");
        printMatrix(secondMatrix);
        int[][] multipliedResultantMatrix = new int[firstMatrixRows][secondMatrixColumns];
        for(int i = 0; i < firstMatrixRows; i++) {
            for(int j = 0; j < secondMatrixColumns; j++) {
                for(int k = 0; k < firstMatrixColumns; k++) {
                    multipliedResultantMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("The multiplied resultant matrix is: ");
        printMatrix(multipliedResultantMatrix);
    }
}
