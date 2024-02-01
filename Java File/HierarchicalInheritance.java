class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: RS " + salary);
    }
}

class Manager extends Employee {
    private String post;

    Manager(String name, int id, double salary, String post) {
        super(name, id, salary);
        this.post = post;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Post: " + post);
    }
}

class Clerk extends Employee {
    private String post;

    Clerk(String name, int id, double salary, String post) {
        super(name, id, salary);
        this.post = post;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Post: " + post);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("John Manager", 101, 60000, "Manager");
        Clerk clerk = new Clerk("Alice Clerk", 201, 35000, "Clerk");

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("\nClerk Details:");
        clerk.displayDetails();
    }
}
