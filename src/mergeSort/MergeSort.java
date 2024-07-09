package mergeSort;

public class MergeSort {
    public static void mergeSort(int[]arr) {
        //get array length
        int arrLength = arr.length;
        //if the length is less than 2 we cannot do anything
        if (arrLength < 2) {
            return;
        }
        //divide array into two halves
        //finding middle index
        int midIndex = arrLength/2;
        //define two half arrays
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex];

        //fill the arrays with elements from the array
        int i = 0;
        for (i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i]; //filled the first half
        }
        int j = midIndex;
        for (j = midIndex; j < arrLength; j++) {
            rightHalf[j - midIndex] = arr[j];//filled the second half
        }

        //call the mergeSort() method recursively to divide two halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //call merge method to create sorted array
        merge(arr,leftHalf,rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        //find length of left and right arrays
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        //define 3 variables to iterate through 3 arrays
        int i=0, j=0, k=0;

        while (i < leftSize && j < rightSize) {
            //compare first elements of leftHalf and rightHalf
            //and fill array with smaller element
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        //if any element left over from both side
        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
