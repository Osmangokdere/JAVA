package ders02_Programlamayagiriş;

import java.util.Scanner;

public class C08_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi yaziniz");
            String isim = scan.nextLine();
        System.out.println("soyadinizi girin");
        String soyisim = scan.nextLine();
        System.out.println("yaşınızı giriniz");
        String yaş = scan.nextLine();

        System.out.println("İsminiz: " + isim.toUpperCase()+"\nSoyisminiz: "
                +soyisim.toUpperCase()+"\nYaşınız: "+yaş+"\nKAYDINIZ BAŞARI İLE TAMAMLANMIŞTIR :)");

    }
}
