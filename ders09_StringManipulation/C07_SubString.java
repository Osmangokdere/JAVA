package ders09_StringManipulation;

public class C07_SubString {
    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));
        //5 index dahil(inclusive) 8i indecx haric(exclusive)

        System.out.println(str.substring(9,17)); //gectikce
        System.out.println(str.substring(3,7)); //a gu

        String isim= "HusEYin";
        //verilen ismi ilk harfi buyuk geriye kalanı kucuk olarak yazdır

        isim=isim.substring(0,1).toUpperCase()+ //ilk harfini buyk yap +
             isim.substring(1).toLowerCase(); //1 index sonrasını kucuk yaoar
        System.out.println(isim);


        //sadece  3.indexi yazdırın

        System.out.println(isim.substring(3,4));

        System.out.println("zor sourunun cevabı" +isim.substring(2,2)); //hiçlik yazdirir

        // System.out.println(isim.substring(5,2));


    }
}
