package Searching;

public class IndexLastOccurance {



    static int firstOccurance(int arr[],int n,int val){
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>val){
                high=mid-1;
            }
            else if(arr[mid]<val){
                low=mid+1;
            }
            else{
                if(mid==n-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;

    }





    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,30};
        int val=20;
        int n=arr.length;
        System.out.println(firstOccurance(arr, n, val));

    }
    
}

    

