package ders35_Exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        //ve sayinin karesini yazdirin
        //kullanici ondalik sayi girerse kullaniciya uyari yazisi yazdirin
        //tekrar sayi isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(girilenSayi*girilenSayi);

    }
}
