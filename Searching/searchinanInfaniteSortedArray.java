package Searching;

public class searchinanInfaniteSortedArray {
    static int search(int arr[], int x) {
        int i = 0;
        while (true) {
            if (i >= arr.length) return -1; // to avoid ArrayIndexOutOfBoundsException
            if (arr[i] == x) return i;
            if (arr[i] > x) return -1;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // sorted even numbers
        }

       
       int result=search(arr, 18);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}

