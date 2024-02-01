import java.util.*;
public class Palindrome{
    public static boolean stringPalindrome(String str2){
        for(int i=0; i<str2.length()/2; i++){
            int n = str2.length();
            if(str2.charAt(i) != str2.charAt(n-i-1)){
                //not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Is string palindrome: ");
        System.out.println(stringPalindrome(str));
    }
}