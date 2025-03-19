public class DuplicateElement {
    static int  reverse(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,3,3,3};
        System.out.println(reverse(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
