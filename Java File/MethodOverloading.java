public class MethodOverloading {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a String parameter
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading ex = new MethodOverloading();

        System.out.println("Sum of two integers: " + ex.add(5, 7));
        System.out.println("Sum of three integers: " + ex.add(3, 6, 9));
        System.out.println("Sum of two doubles: " + ex.add(2.5, 3.7));
        System.out.println("Concatenation of two strings: " + ex.add("Hello, ", "world!"));
    }
}
