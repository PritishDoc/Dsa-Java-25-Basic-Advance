public class MaximumSubArraySumOptimized {
    static int max(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=0;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,-4,6,3,-9};
        System.out.println(max(arr));
    }
}
