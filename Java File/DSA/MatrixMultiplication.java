import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        
        System.out.println("Enter dimensions of the first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        inputMatrix(scanner, matrix1);

        // Input for the second matrix
        System.out.println("Enter dimensions of the second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        inputMatrix(scanner, matrix2);

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix should be equal to the number of rows in the second matrix.");
        } else {
            // Perform matrix multiplication
            int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

            // Display the result matrix
            System.out.println("Resultant Matrix:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }

    // Helper method to input matrix elements
    private static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Helper method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Helper method to display matrix elements
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
