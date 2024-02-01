import java.util.Scanner;

public class StackUsingArray {
    private static final int MAX_SIZE = 100;
    private int[] stackArray;
    private int top;

    public StackUsingArray() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow. Cannot push element " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
        } else {
            System.out.println("Popped element: " + stackArray[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int elementToPush = scanner.nextInt();
                    stack.push(elementToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
