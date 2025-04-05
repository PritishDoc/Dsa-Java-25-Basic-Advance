package Searching;

public class QuickSort {
    public static void sort(int [] a,int start,int end){
        if(start>=end) return;

        int pivot=start+end/2;
        while(start<=end){
            while(a[start]<pivot) start++;
            while (a[end]>pivot) end --;

            if(start<=end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;

            }
                
            
        }
        sort(a, start, end);
    }
    
}
