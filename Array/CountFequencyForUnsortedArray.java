public class CountFequencyForUnsortedArray {
    static void unsrotedfreq(int arr[]){
        int freq=1;
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(j<n &&arr[i]==arr[j]){
                    freq++;

                }
                System.out.println(arr[i]+"->"+freq);
                freq=1;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,2,4,55,23,4,55,9};
        unsrotedfreq(arr);
    }
    
}
