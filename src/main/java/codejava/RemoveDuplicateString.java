package codejava;

import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String arr = ("AutomationAutoSourav");
        HashSet<Character> set = new HashSet<>();

        for (char c : arr.toCharArray()) {
            set.add(c);
        }
        System.out.println(set);
    }
}