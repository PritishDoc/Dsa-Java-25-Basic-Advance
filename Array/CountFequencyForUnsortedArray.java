public class CountFequencyForUnsortedArray {
    static void unsrotedfreq(int arr[]){

        int n=arr.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            int freq=1;
            
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+freq);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,2,4,55,23,4,55,9};
        unsrotedfreq(arr);
    }
    
}
