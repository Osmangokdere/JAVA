package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";

        //str deki sayıları silip metni java guzeldir e donusturelim

        /*str.replaceAll() sadece bir harf veya charsequence i degil
        genellme ile soyleyebilcegimiz ortak ozellikteki tum karakterkerş degistirir*/

        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\D", ""));

        String s1="ilk urun fiyatı :1250TL";
        String s2=" ikinci ı-urun fiyatı: 1500 tl";

        s1=s1.replaceAll("\\D",""); //1250
        s2=s2.replaceAll("\\D", ""); //1500

        System.out.println(s1 + s2); //12501500

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));


    }
}
