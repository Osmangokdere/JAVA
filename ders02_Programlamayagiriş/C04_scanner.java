package ders02_Programlamayagiriş;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //kulla


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi yaziniz");

        String KullaniciAdi = scan.next();


        System.out.println(KullaniciAdi.toUpperCase());

        System.out.println("lütfen soyisminizi giriniz");

        String o= scan.next();
        System.out.println(o.toUpperCase());
    }
}
