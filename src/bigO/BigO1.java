package bigO;

public class BigO1 {
    //Task: print on console last/first element of an arrau
    public static void main(String[] args) {
        int[] arr = {1, 34, 7, 5, 78, 34, 2, 4}; //length may change
        System.out.println(arr[0]); //number of execution is always constant
        System.out.println(arr[arr.length-1]);

        //task: check if given number is even or not
        int x = 324;
        if(x%2==0) System.out.println("even");

    }
}
