package JavaCoding;

public class SmallestElementInArray {

    public static void main(String[] args) {
        int[] a = {10, 20, 5, 40, 50};
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest element: " + min);
    }
}




//    int[] a = {10, 20, 5, 40, 50}; // Step 1: Declare and initialize an array
//    int min = a[0]; // Step 2: Assume the first element is the smallest

//    for (int num : a) { // Step 3: Iterate through the array
//        if (num < min) { // Step 4: Compare each element with the current min
//            min = num; // Step 5: Update min if a smaller value is found

