package shellSort;

import java.util.Arrays;
import java.util.Random;

public class ShellSortRunner {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] numberList = new int[100000000];
//        for (int i = 0; i < numberList.length; i++) {
//            numberList[i] = random.nextInt(100000);
//        }

        int[]arr={7, 4, 5, 9, 8, 2, 1};

        System.out.println("\n******** Before Shell Sort **********\n");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n******** After Shell Sort **********\n");
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
