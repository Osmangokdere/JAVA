package ders07_NEstedIfElseStatemenets;

import java.util.Scanner;

public class C01_IfELseIfStatements {
    public static void main(String[] args) {
        //kilo ve boy al
        //(kilo*10000/(boy*boy))
        //vucut endeksi 30 dan büyükse obez
        //25-30 ile kilolu
          // 20-25 notrmal
            //20 den düşükse zayıf
        //

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");

        double agırlık= scan.nextDouble();

        System.out.println("lütfen boyunuzu girin");

        double boy= scan.nextDouble();


        double vke=(agırlık*10000/(boy*boy));
        System.out.println("vucut kitle endeksiniz : "+ vke);

        if (vke>30) {
            System.out.println("obez");
        } else if (vke>25) {
            System.out.println("kilolu");} else if (vke>20) {
            System.out.println("normal");} else if (vke>0) {
            System.out.println("zayıf");}else{
            System.out.println("yanlış giriş");

        }

    }

    }

