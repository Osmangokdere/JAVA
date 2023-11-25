package ders03_datacastingWrapper;

import java.sql.Wrapper;

public class C05_WrapperClass {

    public static void main(String[] args) {
        /*
        primitive data türleri sadece deger barindırırlar hazır  metodları yoktur
        javaya yapılan talepler doğrultusundan wrapper class lar oluşturmuşlardır.
         */


        char krk= 'b';

        Character krkWrapper = 'c';


        System.out.println(Character.isLetter('5')); //false

        System.out.println(Character.isDigit('7')); //true

        String str= "123";
        String str2="12";

        System.out.println(Integer.parseInt(str) +Integer.parseInt(str2));


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);



    }
}
