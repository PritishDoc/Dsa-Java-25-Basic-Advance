package Sorting;
import java.util.Arrays;
import java.util.Comparator;

public class EvenOddSorting {
   
    static class MyComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            // Sort by even first, then odd
            return (a % 2) - (b % 2);
        }
    }



    public static void main(String[] args) {
        Integer[] arr = {5, 20, 12, 30, 9};

       
        Arrays.sort(arr, new MyComparator());

        System.out.println(Arrays.toString(arr));
    }
}
