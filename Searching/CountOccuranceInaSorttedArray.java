package Searching;

public class CountOccuranceInaSorttedArray {
    static int Countoccrarr(int arr,int n,int val){
        int first=FirstOccurance(arr,val);
        if(first==-1) return 0;
        int last=LastOccurance(arr,val);
        return last-first+1;

    }



    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,30};
        int val=20;
        int n=arr.length;
        System.out.println(Countoccrarr(arr, n, val));
    }
    
}
