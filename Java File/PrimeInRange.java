import java.util.Scanner;
public class PrimeInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // to print prime no in range 2 to n
    public static void printInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int n = sc.nextInt();
        System.out.println("Prime no. in range 2 to "+n+":");
        printInRange(n);
    }
}