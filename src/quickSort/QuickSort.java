package quickSort;


public class QuickSort {
    public static void quickSort(int arr[], int lowIndex, int highIndex) {
        //if there is one element in subarray, it needs to return
        if (lowIndex >= highIndex) {
            return;
        }
        //define pivot
        int pivot = arr[highIndex];
        //define two pinters
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            //moving leftPointer to right
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            //swapping elements which are pointed by leftPointer and rightPointer
            swap(arr, leftPointer, rightPointer);
        }
        //swaping element which are pointed leftPointer and pivot
        swap(arr,leftPointer,highIndex);

        //we are doing partitioning for the subarray which is left side of pivot
        quickSort(arr, lowIndex,leftPointer-1);
        //we are doing partitioning for the subarray which is right side of pivot
        quickSort(arr,leftPointer+1,highIndex);
    }

    //method to swap
    private static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
