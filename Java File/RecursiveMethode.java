import java.util.Scanner;

public class RecursiveMethode {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeHelper(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a recursive method:");
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci Series");
        System.out.println("3. Check for Palindrome");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number for factorial: ");
                int factorialNumber = scanner.nextInt();
                int result = factorial(factorialNumber);
                System.out.println("Factorial of " + factorialNumber + " is " + result);
                break;

            case 2:
                System.out.print("Enter the number of terms for Fibonacci series: ");
                int fibonacciTerms = scanner.nextInt();
                System.out.print("Fibonacci Series: ");
                for (int i = 0; i < fibonacciTerms; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                break;

            case 3:
                scanner.nextLine(); // Consume the previous newline character
                System.out.print("Enter a string to check for palindrome: ");
                String inputString = scanner.nextLine();
                if (isPalindrome(inputString)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
