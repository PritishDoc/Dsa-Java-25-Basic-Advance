package Searching;

public class FindPeakElement {

static int peak(int arr[]){
    int n=arr.length;
    if(n==1)return arr[0];
    if(arr[0]>arr[1])return arr[0];
    if(arr[n-1]>arr[n-2]) return arr[n-1];

    for(int i=0;i<n;i++){
        if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
            return arr[i];
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int arr[]={2,4,53,4,4,5,9};
        System.out.println(peak(arr));
    }
    
}
