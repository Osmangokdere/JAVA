package ders07_NEstedIfElseStatemenets;

import java.util.Scanner;

public class çalısman {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

        int say1 = scan.nextInt();
        int say2 = scan.nextInt();

        if (say1>say2)
        {System.out.println("say1 say dan byüktür");
        }
        if (say1%2==0) {
            System.out.println( "sayı çifttir");}

    }
}
