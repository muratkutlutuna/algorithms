package bigO;

public class BigOn2 {
    public static void main(String[] args) {
        //task: add each element of the array to other elements
        int[] arr = {1, 4}; //1+1, 1+4, 1+7, 4+1, 4+4, 4+7, 7+1, 7+4, 7+7
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + arr[j]);
                count++;
            }
        }
        System.out.println("Number of execution: "+count);
    }
}
