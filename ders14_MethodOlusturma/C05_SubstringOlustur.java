package ders14_MethodOlusturma;

public class C05_SubstringOlustur {
    /*
    Soru 1- Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */

    public static void main(String[] args) {

        String input="Java ne kadar guzel";
        
        int basIndex=5;
        int bitIndex=7;

        kendiSubstringMetodumuz(input,basIndex, bitIndex);
        kendiSubstringMetodumuz("java",1,3);
        kendiSubstringMetodumuz("deneme", 6,3);
        kendiSubstringMetodumuz("java",6,8);


    }
    public static void kendiSubstringMetodumuz(String input, int basIndex, int bitIndex){
        
        if (basIndex>bitIndex){
            System.out.println("baslangıc bitisden buyuk olamaz");
        } else if (basIndex>=input.length()) {
            System.out.println("bitis indexi Stirng in sinirleri disinda");
        }else
            //baslangic ve bitis indexlerine gore
            // baslangic index'i dahil, bitis index'i haric olacak sekilde
            //aradaki harfleri yazdiran bir method olusturun.
            for (int i =basIndex ; i <bitIndex ; i++) {
                System.out.print(input.charAt(i));
            }System.out.println(" ");

            }

        {
    }
}


