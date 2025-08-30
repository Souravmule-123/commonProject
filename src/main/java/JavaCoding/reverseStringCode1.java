package JavaCoding;

public class reverseStringCode1 {
    public static void main(String[] args) {
        String str="Sourav Mule";
        String[] output= str.split(" ");
        System.out.println(output[1] +" "+ output[0]);

    }
}
//        words[0] = "sourav"
//        words[1] = "mule
//        words[1] is "mule", and words[0] is "sourav".
//       The + operator concatenates the two strings with a space in between.
//        This results in "mule sourav" being printed.