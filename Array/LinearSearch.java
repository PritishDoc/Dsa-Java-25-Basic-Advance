public class LinearSearch{
    static int LinearS(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={3,445,55,44,3,77,5};
        int key=5;
        System.out.println("The element is : "+LinearS(arr, key));
    }
}