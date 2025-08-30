package codejava;

public class RemoveSpecialCharacter {

    public static void main (String[] args){

        String input=("Automtion_12_34|1!qw!qa");
        String result=input.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);

    }
}
