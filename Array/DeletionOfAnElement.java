public class DeletionOfAnElement {
    static int Delete(int arr[], int x) {
        int n = arr.length;
        int i;
        
        // Find the index of the element to delete
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        
        // If element is not found, return original size
        if (i == n) return n;
        
        // Shift elements to the left
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        
        return n - 1; // Return new size of the array
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 99, 8, 77};
        int newSize = Delete(arr, 1);

        System.out.println("New size: " + newSize);
        
        // Print only the valid elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
