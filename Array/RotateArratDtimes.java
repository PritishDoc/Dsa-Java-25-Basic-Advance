public class RotateArratDtimes {
    static void leftrotate(int arr[],int n){
     int temp=arr[0];
     for(int i=1;i<n;i++){
        arr[i-1]=arr[i];
        
     } 
     arr[n-1]=temp;  
    
     
    }
    static void Dtime(int arr[],int n,int d){
        for(int i=0;i<d;i++){
            leftrotate(arr, n);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        Dtime(arr, n, 3);
    }
    
}
