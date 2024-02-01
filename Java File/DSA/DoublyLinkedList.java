import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted at the beginning: " + data);
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Inserted at the end: " + data);
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;

        // Find the node to be deleted
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found. Cannot delete.");
            return;
        }

        // Check if the node to be deleted is the head
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                // If the list becomes empty
                tail = null;
            }
        } else {
            // Node to be deleted is not the head
            current.prev.next = current.next;

            // Check if the node to be deleted is the tail
            if (current == tail) {
                tail = current.prev;
                tail.next = null;
            } else {
                // Node to be deleted is neither the head nor the tail
                current.next.prev = current.prev;
            }
        }

        System.out.println("Deleted: " + data);
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        System.out.print("Doubly Linked List (forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        Node reverseCurrent = tail;
        System.out.print("Doubly Linked List (backward): ");
        while (reverseCurrent != null) {
            System.out.print(reverseCurrent.data + " ");
            reverseCurrent = reverseCurrent.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyList = new DoublyLinkedList();

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
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
                    doublyList.insertAtBeginning(elementToInsertAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter element to insert at the end: ");
                    int elementToInsertAtEnd = scanner.nextInt();
                    doublyList.insertAtEnd(elementToInsertAtEnd);
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    doublyList.delete(elementToDelete);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = scanner.nextInt();
                    boolean found = doublyList.search(elementToSearch);
                    System.out.println(found ? "Element found in the list." : "Element not found in the list.");
                    break;
                case 5:
                    doublyList.display();
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
