package insertionSort;

import java.util.Arrays;


public class InsetrionSortRunner {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 15, 17, 5, 10, 11};
        System.out.println("******** Before Insertion Sort **********");
        System.out.println(Arrays.toString(arr));

        InsertionSort.insertionSort(arr);
        System.out.println("******** After Insertion Sort **********");
        System.out.println(Arrays.toString(arr));
    }
}
