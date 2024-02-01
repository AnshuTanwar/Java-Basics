import java.util.Scanner;

public class QueueUsingArray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;

    public QueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow. Cannot enqueue element " + element);
        } else {
            if (front == -1) {
                front = 0;
            }
            queueArray[++rear] = element;
            System.out.println("Enqueued element: " + element);
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow. Cannot dequeue from an empty queue.");
        } else {
            System.out.println("Dequeued element: " + queueArray[front++]);

            if (front > rear) {
                // Reset front and rear when the queue becomes empty
                front = -1;
                rear = -1;
            }
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();

        QueueUsingArray queue = new QueueUsingArray(size);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
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
                    queue.display();
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
