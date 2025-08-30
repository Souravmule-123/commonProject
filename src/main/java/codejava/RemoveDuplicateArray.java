package codejava;

import java.util.HashSet;


public class RemoveDuplicateArray {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,1,2,3,4,6,9};
        HashSet<Integer>set=new HashSet<>();
        for(int c:arr){
            set.add(c);
        }
        System.out.println(set);
    }
}



