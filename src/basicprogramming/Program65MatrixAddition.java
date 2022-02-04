package basicprogramming;

import java.util.Scanner;

public class Program65MatrixAddition {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] matrixAddition(int[][] firstMatrix, int[][] secondMatrix, int[][] answer) {
        for(int i = 0; i < firstMatrix.length; i++) {
            for(int j = 0; j < firstMatrix[i].length; j++) {
                answer[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first matrix rows and columns: ");
        int firstMatrixRows = input.nextInt();
        int firstMatrixColumns = input.nextInt();
        System.out.println("Enter second matrix rows and columns: ");
        int secondMatrixRows = input.nextInt();
        int secondMatrixColumns = input.nextInt();
        if(firstMatrixRows != secondMatrixRows || firstMatrixColumns != secondMatrixColumns) {
            System.out.println("Invalid cannot add two matrices of different dimension");
            return;
        }
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixColumns];
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixColumns];
        int[][] answer = new int[firstMatrixRows][secondMatrixColumns];
        System.out.println("Enter first matrix: ");
        for(int i = 0; i < firstMatrixRows; i++) {
            for(int j = 0; j < firstMatrixColumns; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for(int i = 0; i < firstMatrixRows; i++) {
            for(int j = 0; j < firstMatrixColumns; j++) {
                secondMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println("First Matrix: ");
        printMatrix(firstMatrix);
        System.out.println("Second Matrix: ");
        printMatrix(secondMatrix);
        System.out.println("The added result is : ");
        printMatrix(matrixAddition(firstMatrix, secondMatrix, answer));
    }
}
