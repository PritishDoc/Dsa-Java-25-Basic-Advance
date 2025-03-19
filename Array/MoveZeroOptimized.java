public class MoveZeroOptimized {
   
        static void  zero(int arr[] ){
            int count=0;
            for(int i=0;i<arr.length;i++){
               if(arr[i]!=0){
                //swap 
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
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
    

