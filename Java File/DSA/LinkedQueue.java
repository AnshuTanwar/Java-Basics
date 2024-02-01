import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedQueue {
    private Node front;
    private Node rear;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued element: " + data);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow. Cannot dequeue from an empty queue.");
        } else {
            System.out.println("Dequeued element: " + front.data);
            front = front.next;
            if (front == null) {
                // If the queue becomes empty after dequeue
                rear = null;
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedQueue queue = new LinkedQueue();

        while (true) {
            System.out.println("\nLinked List Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int elementToEnqueue = scanner.nextInt();
                    queue.enqueue(elementToEnqueue);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
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
