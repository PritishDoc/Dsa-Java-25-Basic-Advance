package Searching;

public class AddTwoSortedArrayIntoNewArray {

    public static void merge(int arr[], int arr2[]) {
        int arr3[] = new int[arr.length + arr2.length];
        int i = 0, j = 0, index = 0;

        // Merge both sorted arrays
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                arr3[index++] = arr[i++];
            } else {
                arr3[index++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr
        while (i < arr.length) {
            arr3[index++] = arr[i++];
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            arr3[index++] = arr2[j++];
        }

        // Print merged array
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5};
        int arr2[] = {3, 7, 9, 8, 10};
        merge(arr, arr2);
    }
}
