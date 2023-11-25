package ders15_overloadingWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplanmak üzere sayi alin
        //sayilarin toplami 500'e esit olur ve gecerse

        //girilen sayi adedi,girilen sayilarin toplamini ve "bu kadr yeter "

        Scanner scan = new Scanner(System.in);
        double girilenSayi = 0; //verilen ilk deger bu soru icin olmamalı. cunku loopu bitirir.
        double toplam = 0;
        int sayac=0;

        while (toplam<500) {
            System.out.println("lutfen toplamak icin bir  sayi girin");
            girilenSayi = scan.nextDouble();
            toplam+=girilenSayi;
            sayac++;
    }
        System.out.println("Girilen "+ sayac + "sayinin toplami "+toplam+ " oldu. bu kadar yeter102");
}}
