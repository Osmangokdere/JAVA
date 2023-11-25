package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        //kullanicidan bir ucgenin 3 kenar uzunlugunu alın
        //kenar uzunlukları veya negatif ise "gecersiz kenar uzunlugu" yazdirin
        //ucgen eskenar ise "Eskenar Ucgen" yazdırın, degilse "Eskenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {
            System.out.println("Gecersiz kenar uzunkugu");
        } else if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }
      }
}