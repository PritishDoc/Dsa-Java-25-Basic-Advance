public class ReverseTheArray {
    static void reverse(int arr[]){
        int low=0;
        int high=arr.length-1;

        for(int i=0;i<arr.length-1;i++){
            while(low<high){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
       reverse(arr);
    }
    
}
