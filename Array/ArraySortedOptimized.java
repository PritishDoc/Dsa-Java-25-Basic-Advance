public class ArraySortedOptimized {
    static boolean sorted(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
           
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println(sorted(arr));
    }
    
}
