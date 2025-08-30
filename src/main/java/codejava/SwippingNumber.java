package codejava;

public class SwippingNumber {
    public static void main(String[] args){
    int a=10;
    int b=20;
   int c=a;
   b=c;
   System.out.println(b);

   // without adding a third party variable
//        a=a+b;  //10+20=30
//        b=a-b;  //30-20=10
//        a=a-b;  //30-10=20
//
//        System.out.println(b);
//        System.out.println(a);
}}