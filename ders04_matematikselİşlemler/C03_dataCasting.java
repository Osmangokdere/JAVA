package ders04_matematikselİşlemler;

import java.util.Scanner;

public class C03_dataCasting {

    public static void main(String[] args) {

        // kullanicidan iki int değer alın
        //bunlari birbirine bolün ve sonucu double olarak yazdırın


        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz");

        int sayi1= scan.nextInt(); //20
        int sayi2= scan.nextInt(); //6

        System.out.println(sayi1/sayi2); //3

        double ondalikSonuc= (double)(sayi1/sayi2);
        System.out.println(ondalikSonuc); //3.0

        double dogruSonuc= (double)sayi1/sayi2;
        System.out.println(dogruSonuc);


    }
}
