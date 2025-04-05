package Searching;

public class FindPeakElement {

    static void findAllPeaks(int arr[]) {
        int n = arr.length;

        System.out.print("Peak elements: ");

    
        if (n == 1 || arr[0] > arr[1]) {
            System.out.print(arr[0] + " ");
        }

        
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

       
        if (arr[n - 1] > arr[n - 2]) {
            System.out.print(arr[n - 1] + " ");
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 53, 4, 4, 5, 9};
        findAllPeaks(arr);
    }
}
