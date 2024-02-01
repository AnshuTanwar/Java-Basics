import java.util.*;
public class UpperCaseConversion {
    public static String capitalizeAll(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // If it's a lowercase letter, convert to uppercase
                result.append((char)(ch - 'a' + 'A'));
            } else {
                // Keep other characters as they are
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = sc.nextLine();
        String capitalized = capitalizeAll(input);
        System.out.print("Capitalized String: ");
        System.out.println(capitalized);
    }
}
