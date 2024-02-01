import java.util.Scanner;

public class MatrixAddition {
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

        // Check if matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added. Dimensions are not compatible.");
        } else {
            // Perform matrix addition
            int[][] resultMatrix = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

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
