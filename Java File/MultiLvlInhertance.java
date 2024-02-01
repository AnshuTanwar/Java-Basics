import java.util.Scanner;

class Grandparent {
    int grandparentVar;

    Grandparent(int grandparentVar) {
        this.grandparentVar = grandparentVar;
    }

    void displayGrandparent() {
        System.out.println("Grandparent: " + grandparentVar);
    }
    
    void inputGrandparentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Grandparent's age: ");
        grandparentVar = scanner.nextInt();
    }
}

class Parent extends Grandparent {
    int parentVar;

    Parent(int grandparentVar, int parentVar) {
        super(grandparentVar);
        this.parentVar = parentVar;
    }

    void displayParent() {
        System.out.println("Parent: " + parentVar);
        super.displayGrandparent();
    }
    
    void inputParentDetails() {
        super.inputGrandparentDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Parent's age: ");
        parentVar = scanner.nextInt();
    }
}

class Child extends Parent {
    int childVar;

    Child(int grandparentVar, int parentVar, int childVar) {
        super(grandparentVar, parentVar);
        this.childVar = childVar;
    }

    void displayChild() {
        System.out.println("Child: " + childVar);
        super.displayParent();
    }
    
    void inputChildDetails() {
        super.inputParentDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Child's age: ");
        childVar = scanner.nextInt();
    }
}

public class MultiLvlInhertance {
    public static void main(String args[]) {
        Child childObj = new Child(0, 0, 0);
        childObj.inputChildDetails();
        childObj.displayChild();
    }
}
