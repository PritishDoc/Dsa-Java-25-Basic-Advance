package Searching;

public class BinarySearch {
    static int Bs(int arr[],int target){
        int n=arr.length;
        int low=0, high=n-1;

        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                return low=mid+1;
            }
            else{
                return high=mid-1;
            }
        }
        return -1;

    }





    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,77,55,54,65,47};

        System.out.println(Bs(arr,77));
    }
    
}
