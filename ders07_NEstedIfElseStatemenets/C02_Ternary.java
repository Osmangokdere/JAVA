package ders07_NEstedIfElseStatemenets;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1= "ALİ";
        String str2="ali";

        //verilen iki metin birbiri ile aynı ise "aynı"
        // farklı ise "farklı" yazdirin

        if (str1.equals(str2)){
        System.out.println("metinler aynı");}else {
            System.out.println("metinler farkli");}

        System.out.println(str1.equals(str2)? "metinler aynı": "metinler farkli");




    }
}
