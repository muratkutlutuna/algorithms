package selectionSort;

import java.util.Arrays;

public class SelectionSort {


    public static void selectionsSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[index]) {
                    index=j;
                }
            }
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }

}
