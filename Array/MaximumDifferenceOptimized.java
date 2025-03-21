public class MaximumDifferenceOptimized {
    static int  difference(int arr[]){
        int res=arr[1]-arr[0];

        int minvalue=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res,arr[i]-minvalue);
            minvalue=Math.min(minvalue, i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,6,44,23,56};
        System.out.println(difference(arr));
    }
    
}
