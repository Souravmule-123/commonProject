package helper;



import java.util.Base64;

public class EncDec {
    public static void main(String[]args){
        String password="Sourav@0221";
        byte[] encrypt= Base64.getEncoder().encode(password.getBytes());
        System.out.println(encrypt);
//        log.info(String.valueOf(encrypt));

        byte[] decrypt=Base64.getDecoder().decode(encrypt);
//        log.info(String.valueOf(decrypt));
        System.out.println(decrypt);
    }



}
