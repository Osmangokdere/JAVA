package ders12_forLoops;

import java.util.Arrays;

public class C02_forLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 2 basamaklı 7 ile bolunebşlen

        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) System.out.print(i + " ");

        }
        System.out.println("");

        //13 den baslayıp 100 e kadar 7 artırarak yazdırın
        for (int i = 13; i <= 100; i+=7)
            {System.out.print(i + " ");}
        System.out.println("");


        // 1den 10 akadar (sınırlar dahil) sayilarin karelerini yazdirin
        for (int i = 1; i <=10; i++) {
            System.out.print(i*i+ " ");
        }
    }}



