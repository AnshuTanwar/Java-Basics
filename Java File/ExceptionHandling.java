public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            // Attempt to perform some operations that may throw exceptions
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This will throw an ArithmeticException

            String nullString = null;
            int stringLength = nullString.length(); // This will throw a NullPointerException

            int[] numbers = { 1, 2, 3 };
            int value = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }

        System.out.println("The program continues after exception handling.");
    }
}
