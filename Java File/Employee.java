class Employee {
    String name;
    int EmployeeId;
    int salary;

    public Employee(String name, int EmployeeId, int salary) {
        this.name = name;
        this.EmployeeId = EmployeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name : " + this.name);
        System.out.println("EmployeeId : " + this.EmployeeId);
        System.out.println("salary : " + this.salary);
    }

    public static void main(String args[]) {
        Employee newEmp = new Employee("Aanshu Tanwar ", 12763, 750000);
        newEmp.displayEmployee();
    }
}