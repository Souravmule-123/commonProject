package codejava;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 60, 80};
        Arrays.sort(arr);
    System.out.println(arr[arr.length-2]);
    }
}