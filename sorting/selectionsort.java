package sorting;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {22, 4, 2, 67, 0, 3, 14, 64, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;   // assume current index has minimum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}