package codejava;

import java.util.Arrays;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9,20,30,100};
        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]);
    }
}