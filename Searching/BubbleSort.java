package Searching;
public class BubbleSort{
    static void  Bubblesort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            boolean isswap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswap=true;
                }
            }
            if(!isswap){
                return;
            }
        }
    }
    static void Print(int arr[]){
        for(int x:arr){
            System.out.print(x);
        }
    }
public static void main(String[] args) {
    int arr[]={1, 2, 5, 3, 4};

    Bubblesort(arr);
    Print(arr);
}
}