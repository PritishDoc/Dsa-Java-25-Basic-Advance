public class RemoveDuplicates {
    static int removeduplicates(int arr[]){
        int n = arr.length;
        if (n == 0) return 0; // Handle empty array case

        int temp[] = new int[n]; // Correct array allocation
        int res = 1;
        temp[0] = arr[0];

        for (int i = 1; i < n; i++) { // Start from 1
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            arr[i] = temp[i]; // Copy unique elements back to original array
        }

        return res; // Return unique count
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 4, 5, 6, 6}; // Example with duplicates
        int newSize = removeduplicates(arr);
        
        System.out.println("New size: " + newSize);
        System.out.print("Modified array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
