package ders04_matematikselİşlemler;

import java.util.Scanner;

public class C02_dataCasting {
    public static void main(String[] args) {


// double cıkan sonucu tam sayı halinde sonuca yansitma


        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int bolmeSonucuTamSayı= (int)(sayi1/sayi2);

        System.out.println("Sonuç : "+bolmeSonucuTamSayı);




    }
}
