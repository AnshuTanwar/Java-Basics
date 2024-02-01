import java.util.Scanner;

public class ArrayOperations {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int largestArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printPairs(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static int findNumberInArray(int[] arr, int numberToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Array Operations Menu:");
        System.out.println("1. Reverse an Array");
        System.out.println("2. Find the Largest Element in an Array");
        System.out.println("3. Print Pairs with a Specific Sum");
        System.out.println("4. Find Maximum Subarray Sum");
        System.out.println("5. Find a Specific Number in the Array");
        System.out.print("Enter your choice (1, 2, 3, 4, or 5): ");
        choice = input.nextInt();

        int[] arr = {10, 20, 30, 40, 50, 60, 70}; 

        switch (choice) {
            case 1:
                reverseArray(arr);
                System.out.println("Reversed Array:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                break;
            case 2:
                int max = largestArray(arr);
                System.out.println("Largest Element in the Array: " + max);
                break;
            case 3:
                System.out.print("Enter the target sum: ");
                int targetSum = input.nextInt();
                printPairs(arr, targetSum);
                break;
            case 4:
                int maxSum = maxSubArraySum(arr);
                System.out.println("Maximum Subarray Sum: " + maxSum);
                break;
            case 5:
                System.out.print("Enter the number to find: ");
                int numberToFind = input.nextInt();
                int index = findNumberInArray(arr, numberToFind);
                if (index != -1) {
                    System.out.println("Number " + numberToFind + " found at index " + index);
                } else {
                    System.out.println("Number " + numberToFind + " not found in the array.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, 4, or 5.");
        }

        input.close();
    }
}
