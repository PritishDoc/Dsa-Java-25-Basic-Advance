public class LargestElementOptimization {
    static int largest(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]){
                res=arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,23,45,63};
        System.out.println(largest(arr));
    }
    
}
//T(n)=O(n);