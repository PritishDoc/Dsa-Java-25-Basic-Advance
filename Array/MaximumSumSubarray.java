public class MaximumSumSubarray {
    static int sumSubarray(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr=curr+arr[j];
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,-5,2,-4};
        System.out.println(sumSubarray(arr));
    }
    
}
