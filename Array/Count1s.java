public class Count1s {
    static int maxConsecutive(int arr[]){
        int result = 0, curr = 0;

        for(int num : arr){
            if(num == 1){
                curr++;  // Increase count if 1 is found
                result = Math.max(result, curr);
            } else {
                curr = 0; // Reset count if 0 is found
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 0, 0, 1, 0};
        System.out.println("Maximum consecutive 1s: " + maxConsecutive(arr));
    }
}
