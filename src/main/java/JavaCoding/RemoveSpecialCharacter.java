package JavaCoding;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String input = "Hello@123 World! #Automation_2024";
        String result = input.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println("String after removing special characters: " +result);
    }
}


