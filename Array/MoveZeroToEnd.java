public class MoveZeroToEnd {
    static void  zero(int arr[] ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,0,2,4,0,2,0};

        zero(arr);
    }
    
}
