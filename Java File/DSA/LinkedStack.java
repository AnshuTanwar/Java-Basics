import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedStack {
    private Node top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed element: " + data);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
        } else {
            System.out.println("Popped element: " + top.data);
            top = top.next;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();

        while (true) {
            System.out.println("\nLinked List Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
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
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
