package ders02_Programlamayagiriş;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("kısa kenarı girin ve enter e basın");

        double uzunkenar = scan.nextDouble();

        System.out.println("uzun kenarı girin");

        double kısakenar = scan.nextDouble();
        System.out.println("Dikdörtgenin Alanı :" + kısakenar*uzunkenar);


    }
}
