package bubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 3};
        System.out.println("******** Before Bubble Sort **********");
        System.out.println(Arrays.toString(arr));

        BubbleSort.bubbleSort(arr);
        System.out.println("******** After Bubble Sort **********");
        System.out.println(Arrays.toString(arr));
    }
}
