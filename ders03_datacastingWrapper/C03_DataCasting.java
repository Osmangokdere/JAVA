package ders03_datacastingWrapper;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");

        int girilensayi= scan.nextInt();

        byte donusensayi=(byte)girilensayi;
        System.out.println("girdiğiniz " +girilensayi+ "in dönüsmus hali :" +donusensayi);


    }
}
