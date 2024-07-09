package mergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberList = new int[100000000];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = random.nextInt(100000);
        }

        int[]arr={7, 4, 5, 9, 8, 2, 1};

        System.out.println("\n******** Before Merge Sort **********\n");
        System.out.println(Arrays.toString(numberList));
        System.out.println("\n******** After Merge Sort **********\n");
        MergeSort.mergeSort(numberList);
        System.out.println(Arrays.toString(numberList));
    }
}
