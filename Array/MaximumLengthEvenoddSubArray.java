public class MaximumLengthEvenoddSubArray {
    static int EvenOddLength(int arr[]){
        int res=1;
        int curr=1;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
                    curr++;

                }
                else{
                    break;
                }
            }
        }
        return res=Math.max(res,curr);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(EvenOddLength(arr));
    }
}
