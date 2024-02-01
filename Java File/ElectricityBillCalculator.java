import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Electricity Bill Calculator");
        System.out.println("Select a Tariff Plan:");
        System.out.println("1. Residential");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int choice = input.nextInt();

        double unitRate = 0.0;
        switch (choice) {
            case 1:
                unitRate = 5.00; // Residential rate per unit
                break;
            case 2:
                unitRate = 7.50; // Commercial rate per unit
                break;
            case 3:
                unitRate = 10.00; // Industrial rate per unit
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                System.exit(0);
        }

        System.out.print("Enter the total units consumed: ");
        double unitsConsumed = input.nextDouble();

        double totalBill = (unitsConsumed * unitRate) + 500.0; // Adding a fixed charge of 500

        System.out.println("Your Electricity Bill: Rs " + totalBill);

        input.close();
    }
}
