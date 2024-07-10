import bubbleSort.BubbleSort;
import insertionSort.InsertionSort;
import mergeSort.MergeSort;
import quickSort.QuickSort;
import selectionSort.SelectionSort;
import shellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class CompareAlgorithms {
    public static void main(String[] args) {

        int numOfElements = 1000;
        long startTime;
        long endTime;
        double estimatedTime;

        int[] unOrderedArray = createRandomArray(numOfElements);
        int[] unOrderedArray1 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray2 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray3 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray4 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray5 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray6 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);
        int[] unOrderedArray7 = Arrays.copyOf(unOrderedArray, unOrderedArray.length);

        System.out.println("************ Unordered Arrays assortion ************\n");

        //insertionSort
        startTime = System.nanoTime();
        InsertionSort.insertionSort(unOrderedArray1);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Insertion Sort: "+estimatedTime);

        //selectionSort
        startTime = System.nanoTime();
        SelectionSort.selectionsSort(unOrderedArray2);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Selection Sort: "+estimatedTime);

        //bubbleSort
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(unOrderedArray3);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Bubble Sort: "+estimatedTime);

        //quickSort
        startTime = System.nanoTime();
        QuickSort.quickSort(unOrderedArray4,0,unOrderedArray4.length-1);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Quick Sort: "+estimatedTime);

        //mergeSort
        startTime = System.nanoTime();
        MergeSort.mergeSort(unOrderedArray5);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Merge Sort: "+estimatedTime);

        //shellSort
        startTime = System.nanoTime();
        ShellSort.shellSort(unOrderedArray6);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Shell Sort: "+estimatedTime);

        //arraySort
        startTime = System.nanoTime();
        Arrays.sort(unOrderedArray7);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Array Sort: "+estimatedTime);

        System.out.println("\n************ Ordered Arrays assortion ************\n");

        int[] orderedArray = createOrderedArray(numOfElements);
        int[] orderedArray1 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray2 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray3 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray4 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray5 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray6 = Arrays.copyOf(orderedArray, orderedArray.length);
        int[] orderedArray7 = Arrays.copyOf(orderedArray, orderedArray.length);

        //insertionSort
        startTime = System.nanoTime();
        InsertionSort.insertionSort(orderedArray1);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Insertion Sort: "+estimatedTime);

        //selectionSort
        startTime = System.nanoTime();
        SelectionSort.selectionsSort(orderedArray2);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Selection Sort: "+estimatedTime);

        //bubbleSort
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(orderedArray3);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Bubble Sort: "+estimatedTime);

        //quickSort
        startTime = System.nanoTime();
        QuickSort.quickSort(orderedArray4,0,orderedArray4.length-1);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Quick Sort: "+estimatedTime);

        //mergeSort
        startTime = System.nanoTime();
        MergeSort.mergeSort(orderedArray5);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Merge Sort: "+estimatedTime);

        //shellSort
        startTime = System.nanoTime();
        ShellSort.shellSort(orderedArray6);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Shell Sort: "+estimatedTime);

        //arraySort
        startTime = System.nanoTime();
        Arrays.sort(orderedArray7);
        endTime = System.nanoTime();
        estimatedTime = (double) (endTime - startTime) ;
        System.out.println("Array Sort: "+estimatedTime);
    }

    /**
     * method to create array with random numbers
     * @param numOfElements
     * @return number list
     */
    public static int[] createRandomArray(int numOfElements) {
        Random random = new Random();
        int[] numberList = new int[numOfElements];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = random.nextInt(10000);
        }
        return numberList;
    }

    /**
     * method to create array with sorted elements
     * @param numOfElements
     * @return sorted number list
     */
    public static int[] createOrderedArray(int numOfElements) {
        int[] numberList = new int[numOfElements];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = i;
        }
        return numberList;
    }
}

