package ders02_Programlamayagiriş;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("lütfen ondalıklı bir sayı giriniz");
         double ondalıklıSayi= scan.nextDouble();

        System.out.println("lütfen tam sayı giriniz");

        int tamsayi=scan.nextInt();

        System.out.println("Toplam :"+ondalıklıSayi+tamsayi);
        System.out.println("Çarpım :"+ondalıklıSayi*tamsayi);




          }
}
