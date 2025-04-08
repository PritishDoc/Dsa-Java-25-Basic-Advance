public class TwoPointerSum {
static int[] Target(int arr[],int target){
    int j=arr.length-1;
    int i=0;

    while(i<j){
        for(;i<arr.length-1;j++){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
            else {
                j--;
            }
        }
    }
    return new int[]{};
}

 

    public static void main(String[] args) {
        int arr[]={2,32,4,5,4,3,9};
        System.out.println(Target(arr, 36));
    }
    
}
