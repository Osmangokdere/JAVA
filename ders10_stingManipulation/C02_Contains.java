package ders10_stingManipulation;

public class C02_Contains {
    public static void main(String[] args) {

        String str="JAva ile kodlama cok zevkli";

        //CharSequence: Char dizisi

        System.out.println(str.contains("cok")); //true
        System.out.println(str.contains("adla"));
        System.out.println(str.contains("a"));

       // System.out.println(str.contains('s')); parametre olarak char kabul etmez




    }
}
