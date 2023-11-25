package ders08_Ternary_Swich;

import java.util.Scanner;

public class C05_NestedTernary {
    public static void main(String[] args) {
        //bir sayı alin
        //(pozitifse cift sayı yada değil
        //pozitif degilse 3 basamakli veya degil

        int sayi=20;


        if (sayi>0){
            System.out.println(sayi%2==0 ? "cift sayi" : "cift sayi degil");

        }else{

            System.out.println(sayi<-99&& sayi>-1000 ?  "uc basamakli" : "uc basamakli deil");


            String sonuc= sayi>0 ?
                    sayi%2==0 ? "cift sayi" : "cift sayi degil"
                    : sayi<-99&& sayi>-1000 ?  "uc basamakli" : "uc basamakli deil";

        }
    }

    public static class C01_Ternary {
        public static void main(String[] args) {
            //kullanicidan bir sayi alın

            //sayi pozitif ise iki katını yazdırın
            //degilse sayiya 10 ekleyip yazdırın

            Scanner scan=new Scanner(System.in);
            System.out.println("lütfen bir sayı girieiniz");
            double sayi= scan.nextDouble();

            if (sayi>0){
                System.out.println(sayi*2);
            } else {
                System.out.println(sayi+10);}

            System.out.println(sayi>0 ? 2*sayi : sayi+10);
        }
    }
}
