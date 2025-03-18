import java.util.Arrays;

public class InsertElement {
    static int insert(int arr[], int x, int n, int pos) {
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid Position!");
            return n;
        }

        // Create a new array with one extra size
        int newArr[] = new int[n + 1];

        // Copy elements and insert the new element at `pos`
        for (int i = 0; i < pos - 1; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos - 1] = x; // Insert `x` at position

        for (int i = pos; i <= n; i++) {
            newArr[i] = arr[i - 1];
        }

        // Print the updated array
        System.out.println("Updated array: " + Arrays.toString(newArr));

        return (n + 1); // New length of array
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 8};
        int pos = 4; // Position (1-based index)
        int x = 99;
        int n = arr.length;

        int newSize = insert(arr, x, n, pos);
        System.out.println("New size of array: " + newSize);
    }
}
