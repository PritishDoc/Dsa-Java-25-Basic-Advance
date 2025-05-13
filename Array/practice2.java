public class practice2 {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=30;i++){
            
            System.out.println(a+" ");
            //System.out.println(c+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
    
}
