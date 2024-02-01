import java.util.Scanner;

public class TwoDArrayOperations {
    public static void largestNumber(int[][] matrix) {
        int largest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number is " + largest);
    }

    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Primary diagonal
            sum += matrix[i][matrix.length - 1 - i]; // Secondary diagonal
        }
        return sum;
    }

    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix Operations Menu:");
        System.out.println("1. Find the Largest Number");
        System.out.println("2. Search for a Key");
        System.out.println("3. Calculate Diagonal Sum");
        System.out.println("4. Staircase Search");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = sc.nextInt();

        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key;
        boolean result;

        switch (choice) {
            case 1:
                // Option 1: Find the Largest Number
                largestNumber(matrix);
                break;

            case 2:
                // Option 2: Search for a Key
                System.out.print("Enter the key to search: ");
                key = sc.nextInt();
                result = search(matrix, key);
                break;

            case 3:
                // Option 3: Calculate Diagonal Sum
                int sum = diagonalSum(matrix);
                System.out.println("Diagonal Sum: " + sum);
                break;

            case 4:
                // Option 4: Staircase Search
                System.out.print("Enter the key to search: ");
                key = sc.nextInt();
                result = staircaseSearch(matrix, key);
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }
    }
}
