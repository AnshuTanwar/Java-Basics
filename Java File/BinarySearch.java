import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if (numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            } else{
                end = mid-1;
            }
                                        
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, -4, -1, -2, 1, 5, -3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.println("index of key is " + binarySearch(numbers, key));
    }
}