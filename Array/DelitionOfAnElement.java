public class DelitionOfAnElement {
    static int Delete(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                arr[i]=arr[i+1];
            }
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,99,8,77};

        System.out.println(Delete(arr, 1));

        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
