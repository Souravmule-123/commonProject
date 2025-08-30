package JavaCoding;

import java.util.HashSet;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 56, 7, 8, 8, 9, 9};
        HashSet<Integer> set = new HashSet<>();
        for (int num : input) {
        set.add(num);
        }
        System.out.println(set);
    }
}