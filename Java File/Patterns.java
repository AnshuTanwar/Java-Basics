import java.util.*;
public class Patterns {
    public static void printHollowRectangle(int rows, int columns) {
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // Boundary conditions
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printHalfPyramid(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHalfInvertedPyramid(int n) {
        // Outer loop for lines
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printFloydTriangle(int n) {
        // Counter for numbers
        int counter = 1;
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void printAlternating01Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void printButterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // Stars - increasing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces - middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Stars - decreasing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // Stars - increasing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces - middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Stars - decreasing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print Hollow rectangle pattern");
        System.out.println("2. Print Half Pyramid Pattern");
        System.out.println("3. Print Half Inverted Pyramid Pattern");
        System.out.println("4. Print Floyd's Triangle Pattern");
        System.out.println("5. Print Alternating 01 Triangle Pattern");
        System.out.println("6. Print Butterfly Pattern");
        System.out.print("Enter your choice: ");
        int patternChoice = sc.nextInt();

        switch (patternChoice) {
            case 1:
                System.out.println("Hollow Rectangle Pattern:");
                printHollowRectangle(5, 8);
                break;

            case 2:
                System.out.println("Half Pyramid Pattern:");
                printHalfPyramid(5);
                break;

            case 3:
                System.out.println("Half Inverted Pyramid Pattern:");
                printHalfInvertedPyramid(5);
                break;

            case 4:
                System.out.println("Floyd's Triangle Pattern:");
                printFloydTriangle(4);
                break;

            case 5:
                System.out.println("Alternating 01 Triangle Pattern:");
                printAlternating01Triangle(5);
                break;

            case 6:
                System.out.println("Butterfly Pattern:");
                printButterfly(4);
                break;

            default:
                System.out.println("Invalid pattern choice.");
        }
    }
}
