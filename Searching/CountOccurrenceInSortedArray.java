package Searching;

public class CountOccurrenceInSortedArray {
    
    static int Countoccrarr(int arr[], int n, int val) {
        int first = FirstOccurance(arr, val);
        if (first == -1) return 0;
        int last = LastOccurance(arr, val);
        return last - first + 1;
    }

    static int FirstOccurance(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // Moved outside the loop
    }

    static int LastOccurance(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1; // Moved outside the loop
    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 10, 10, 20, 20, 30};
        int val = 20;
        int n = arr.length;
        System.out.println(Countoccrarr(arr, n, val)); // Output: 2
    }
}
