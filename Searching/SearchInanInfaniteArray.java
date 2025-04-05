package Searching;

public class SearchInanInfaniteArray {

    static int search(int arr[], int x) {
        if (arr[0] == x) return 0;

        int i = 1;
        // First find range
        while (i < arr.length && arr[i] < x) {
            i = i * 2;
        }

        // Now do linear search in found range
        int low = i / 2;
        int high = Math.min(i, arr.length - 1);

        for (int j = low; j <= high; j++) {
            if (arr[j] == x) return j;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // sorted even numbers
        }

        int result = search(arr, 18);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
