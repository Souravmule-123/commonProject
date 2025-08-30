package JavaCoding;
import java.util.HashMap;


public class charCountMapCode {
        public static void main(String[] args) {
            String str = "Automationjava";
            HashMap<Character, Integer> charCount=new HashMap<>();
            for(char c: str.toCharArray()){
                charCount.put(c,charCount.getOrDefault(c,0)+1);
            }
            System.out.println(charCount);
        }
    }

