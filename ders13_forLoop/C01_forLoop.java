package ders13_forLoop;

public class C01_forLoop {
    public static void main(String[] args) {
      //kullanicidan bir string isteyin ve onu tersten yazdirin

        String input="java ne kadar güzel";

        for (int i = input.length()-1; i >=0;i--){
            System.out.print(input.charAt(i));
    }
}}
