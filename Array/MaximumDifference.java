public class MaximumDifference {
    static int difference(int arr[]){
        int res=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,4,11,4,5,9,35};
        System.out.println(difference(arr));
    }
    
}
