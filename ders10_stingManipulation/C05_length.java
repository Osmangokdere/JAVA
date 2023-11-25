package ders10_stingManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "uzunkavaklaraltındayataruyumazogli";
        System.out.println(str.length());
        // son karakleri yazdirin

        System.out.println(str.charAt(33));

        System.out.println(str.charAt(str.length()-1)); //son karakteri elde etmek icin kullanilir

        //sondan 3. karakteri yazdurun

        System.out.println(str.charAt(str.length()-3));



}}
