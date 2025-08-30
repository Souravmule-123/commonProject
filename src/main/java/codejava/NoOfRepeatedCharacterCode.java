package codejava;

import java.util.HashMap;

public class NoOfRepeatedCharacterCode {
        public static void main(String[] args) {
            String input = "programming";
            countRepeatedCharacters(input);
        }
        public static void countRepeatedCharacters(String str) {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
            System.out.println("Repeated characters and their occurrences:");
            for (char ch : charCountMap.keySet()) {
                if (charCountMap.get(ch) > 1) {
                    System.out.println(ch + ":" + charCountMap.get(ch));
                }
            }
        }
    }

