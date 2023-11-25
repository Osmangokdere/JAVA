package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_Carpım {
    //main method icerisnde kullanicidan iki sayi alin
    //n-bu iki sayiyi parametre olarka kabul edip, carpımlarını main metoda donduren bir metdo olusturun

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayı yazınız");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(carpımMethodu(sayi1, sayi2));

        double carpımSonucu=carpımMethodu(6,2);


    }
        public static double carpımMethodu(double sayi1, double sayi2){
            System.out.println("carpım methodu calıstı");
            return sayi1*sayi2;




        }
    }

