package helper;

import org.apache.hc.client5.http.utils.Base64;

public class EncryptDecrypt {

    public String getEncodedString(String encode){
     byte[] encodeString=   Base64.encodeBase64(encode.getBytes());
        return new String(encodeString);
    }
    public String getDecodedString(String decode) {
        byte[] decodeString = Base64.decodeBase64(decode);
        return new String(decodeString);
    }
    public static void main (String[] args){
        EncryptDecrypt encodeDecode=new EncryptDecrypt();
        System.out.println(encodeDecode.getDecodedString("Sourav@0221"));
//        log.info(encodeDecode.getDecodedString(""));
    }

}
