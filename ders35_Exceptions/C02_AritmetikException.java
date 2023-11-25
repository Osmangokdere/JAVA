package ders35_Exceptions;

public class C02_AritmetikException {
    public static void main(String[] args) {
        //verilen iki sayiyi birbirine bölüp
        //sonucu tamsayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            //riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("bakalim bu kod calısacak mi");
        } catch (Exception e) {
            System.out.println("sayi sifira bolunemez");
            //catch (0 dan sonraki {} catch blogu denir
            //catch (Exception e) ongordugumuz risk

        }
    }

}
