package JavaCoding;

import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String arr=("SouravSourav");
        HashSet<Character> set= new HashSet<>();
        for(char ch : arr.toCharArray()){
            set.add(ch);
        }
        System.out.println(set);
    }
}


