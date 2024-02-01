// Arithmetic Exception.
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("Enter first number:- ");
        a = sc.nextInt();
        System.out.println(" Enter Second number:- ");
        b = sc.nextInt();
        try{
            System.out.println(a + " divided by "+ b +" is :- " + a/b);
        }
        catch (ArithmeticException e ){
            System.out.println(e + "\n Runtime error occurred.");
        }
    }
}