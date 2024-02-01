public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {74, 26, 22, 8, 82, 11, 90};
        System.out.print("Unsorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Sorted array: ");
        insertionSort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
