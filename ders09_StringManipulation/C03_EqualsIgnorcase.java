package ders09_StringManipulation;

public class C03_EqualsIgnorcase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        /*herhangi bir bosluk olursa kabul etmez.
        equalsıgnoreCase buyuk kucuk harf kullanılarak yazılan metinleri esit kabul eder

        aralarında bosluk varsa bile kabul etmez. buyuk kucuk harfi tolore(ignore)  eder
         */

        System.out.println(str1.equalsIgnoreCase("Ali "));



    }
}
