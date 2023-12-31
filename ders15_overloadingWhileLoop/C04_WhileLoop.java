package ders15_overloadingWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere tamsayilar alin
        kullanici 0'a basarsa sayi alma islemini bitirin
        kullanicinin kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 5; //verilen ilk deger bu soru icin olmamalı. cunku loopu bitirir.
        int sayac = 0;
        int toplam = 0;

        while (girilenSayi != 0) {
            System.out.println("lutfen toplamak icin bir tam sayi girin" +
                    "\n ve bitirmek icin 0'a basın");

            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                sayac++;
                toplam = toplam + girilenSayi;

            }
        }System.out.println("girilen "+sayac+" adet sayinin toplami "+toplam);
    }
}