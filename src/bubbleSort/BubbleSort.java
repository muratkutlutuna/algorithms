package bubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[]arr) {
        boolean swapped = false; // not swapped
        do {
            swapped = false; //avoid infinite loop
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    //adjacent elements
                    int temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swapped = true; //if any two elements are swapped, it must continue
                }
            }

        } while (swapped);
    }
}
