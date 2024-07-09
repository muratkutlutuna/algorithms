package selectionSort;

import java.util.Arrays;

import static selectionSort.SelectionSort.selectionsSort;

public class SelectionSortRunner {
    public static void main(String[] args) {
        System.out.println("******** Before Selection Sort **********");
        int[]arr={7, 4, 5, 9, 8, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println("******** After Selection Sort **********");
        selectionsSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
