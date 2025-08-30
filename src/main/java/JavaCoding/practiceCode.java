package JavaCoding;


public class practiceCode {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}







