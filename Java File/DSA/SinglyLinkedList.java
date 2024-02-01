import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at the beginning: " + data);
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted at the end: " + data);
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found. Cannot delete.");
        } else {
            prev.next = current.next;
            System.out.println("Deleted: " + data);
        }
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
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        while (true) {
            System.out.println("\nLinked List Operations:");
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
                    linkedList.insertAtBeginning(elementToInsertAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter element to insert at the end: ");
                    int elementToInsertAtEnd = scanner.nextInt();
                    linkedList.insertAtEnd(elementToInsertAtEnd);
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    linkedList.delete(elementToDelete);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = scanner.nextInt();
                    boolean found = linkedList.search(elementToSearch);
                    System.out.println(found ? "Element found in the list." : "Element not found in the list.");
                    break;
                case 5:
                    linkedList.display();
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
