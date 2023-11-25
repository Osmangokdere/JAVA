package ders03_datacastingWrapper;

import java.util.Scanner;

public class C02_Datacasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilensayi= scan.nextInt();

        byte dönüsen_sayi=(byte)girilensayi;

        System.out.println("girdiğiniz"+girilensayi+ "nin değişen hali :"+dönüsen_sayi);
    }
}
