import java.util.*;

public class Calculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter your 1st no. : ");
        double a = sc.nextDouble();
        System.out.println("Enter your 2nd no. : ");
        double b = sc.nextDouble();
        System.out.println("Calculating your answer.......");
        //arithmatic operations
        double sum = a+b;
        double difference = a-b;
        double multiply = a*b;
        double div = a/b;
        System.out.println("Sum is : " + sum);
        System.out.println("difference is : " + difference);
        System.out.println("multiplication is : " + multiply);
        System.out.println("division is : " + div);
                     
    }
}
    
