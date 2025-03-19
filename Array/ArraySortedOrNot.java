public class ArraySortedOrNot {
    static boolean sorted(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        System.out.println(sorted(arr));
    }
    
}
