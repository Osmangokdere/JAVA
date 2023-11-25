package ders16_DoWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=10;
        int toplam=0;

        do {
            toplam=toplam+sayi;
            sayi++;

        }while (sayi<=12);
        System.out.println(toplam);

        /*do While loop un 2 avantaji vardır
       1-loop body si en az bir kere calısir*/
    }
}
