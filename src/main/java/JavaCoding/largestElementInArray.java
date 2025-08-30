package JavaCoding;

public class largestElementInArray {
//    public static void main(String[] args) {
//        int[] a={10,20,30,40,50};
//        Arrays.sort(a);
//        System.out.println(a[a.length-1]);
//    }
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int Max = input[0];
        for (int num : input) {
            if (num > Max) {
                Max = num;
            }
        }
        System.out.println("Largest element: " + Max);
    }
}
