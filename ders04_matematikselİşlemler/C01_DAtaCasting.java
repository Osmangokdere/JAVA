package ders04_matematikselİşlemler;

import java.util.Scanner;

public class C01_DAtaCasting {
    public static void main(String[] args) {
        double say1=20;
        double say2=6;
        System.out.println(say1/say2);

        double say3= 6;
        System.out.println(say1/say3);

        // kullanıcıdan iki double sayı alın, sonucunu tam sayı kısmını yazın

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz");
        double sayi1 =scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(sayi1/sayi2);



    }
}
