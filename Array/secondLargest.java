public class secondLargest {
    static int secondLargest(int arr[]) {
        int n = arr.length;
        if (n < 2) return -1;  // If less than 2 elements, return -1

        int res = -1;
        int largest = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return (res == -1) ? -1 : arr[res];  // Return second largest value, not index
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 8, 20, 15};  // Example array
        int result = secondLargest(arr);
        
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + result);
        }
    }
}
