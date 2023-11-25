package ders02_Programlamayagiriş;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen birinci tamsayıyı giriniz");

        int sayi1= scan.nextInt();

        System.out.println("lütfen ikinci tamsayıyı giriniz");
        int sayi2= scan.nextInt();

        int bos;
        bos= sayi2;
        sayi2= sayi1;
        sayi1= bos;
        System.out.println("birinci sayının değeri :"+sayi1);
        System.out.println("ikinci sayının değeri :"+sayi2);







    }
}
