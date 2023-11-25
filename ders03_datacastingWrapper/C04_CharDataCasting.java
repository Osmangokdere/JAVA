package ders03_datacastingWrapper;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        System.out.println('a'+'b'); // 97+98=195

        // kullanıcıdan char bir karakter alın
        // o karakterden sonra gelen 3 karakteri yazdırın.
        // ornek input : a,  output :bcd

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir karakter girin");

        char girilenKrk = scan.next().charAt(0);

        System.out.println(""+(char)+(girilenKrk+1) +(char) (girilenKrk+2) +(char)( girilenKrk+3));


    }
}
