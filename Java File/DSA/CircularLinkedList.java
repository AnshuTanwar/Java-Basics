import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            head = newNode;
            current.next = head;
        }
        System.out.println("Inserted at the beginning: " + data);
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        System.out.println("Inserted at the end: " + data);
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;
        Node prev = null;

        // Find the node to be deleted
        while (current.next != head && current.data != data) {
            prev = current;
            current = current.next;
        }

        // Check if the node to be deleted is the head
        if (current == head) {
            if (current.next == head) {
                // If there is only one node in the list
                head = null;
            } else {
                // If there are multiple nodes, update head and the last node's next
                head = current.next;
                Node temp = head;
                while (temp.next != current) {
                    temp = temp.next;
                }
                temp.next = head;
            }
        } else {
            // Node to be deleted is not the head
            prev.next = current.next;
        }

        System.out.println("Deleted: " + data);
    }

    public boolean search(int data) {
        if (head == null) {
            return false;
        }

        Node current = head;

        // Traverse the circular linked list
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        // Traverse the circular linked list
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList circularList = new CircularLinkedList();

        while (true) {
            System.out.println("\nCircular Linked List Operations:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at the beginning: ");
                    int elementToInsertAtBeginning = scanner.nextInt();
                    circularList.insertAtBeginning(elementToInsertAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter element to insert at the end: ");
                    int elementToInsertAtEnd = scanner.nextInt();
                    circularList.insertAtEnd(elementToInsertAtEnd);
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    circularList.delete(elementToDelete);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = scanner.nextInt();
                    boolean found = circularList.search(elementToSearch);
                    System.out.println(found ? "Element found in the list." : "Element not found in the list.");
                    break;
                case 5:
                    circularList.display();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
