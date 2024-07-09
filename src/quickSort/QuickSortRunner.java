package quickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberList = new int[100000000];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = random.nextInt(100000);
        }

        System.out.println("\n******** Before Quick Sort **********\n");
        int[]arr={7, 4, 5, 9, 8, 2, 1};
        System.out.println(Arrays.toString(numberList));
        System.out.println("\n******** After Quick Sort **********\n");
        QuickSort.quickSort(numberList,0,numberList.length-1);
        System.out.println(Arrays.toString(numberList));

    }
}
