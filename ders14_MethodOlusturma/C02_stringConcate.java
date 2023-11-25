package ders14_MethodOlusturma;

public class C02_stringConcate {

    //verilen iki Stringi parametre kabul edip
    //bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    //main metod a donduren bir metod olusturun

    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";
        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("Bu da oldu", "degil mi"));
        System.out.println(birlestirMethodu("hadi bakalım", "iyisiniz"));


    }
    public static String birlestirMethodu(String str1, String str2){
        return str1+" " +str2;

    }
}
