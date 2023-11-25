package ders10_stingManipulation;

public class C03_Startswith {
    public static void main(String[] args) {

        String str="manti acarken java ogrenilmez";

        //str manti ile mi basliyor

        System.out.println(str.startsWith("Manti")); // false kucuk m

        System.out.println(str.startsWith("m")); //true

        System.out.println(str.startsWith("manti acarken java ogrenilmez")); //true

        System.out.println(str.startsWith("")); //true hıclik
        System.out.println(str.startsWith(" ")); // false space

        str.startsWith("acarken",6); //6.index sonrası acarken ile mi baslıyor //true

        System.out.println(str.startsWith("manti",0));

        System.out.println(str.startsWith("java",10)); //false
    }
}
