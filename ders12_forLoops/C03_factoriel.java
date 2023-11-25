package ders12_forLoops;

public class C03_factoriel {
    public static void main(String[] args) {

        //kullanicinin verdiği sayinin faktoriyelini bulalım

        int sayi=10;
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--)
            faktoriyel=faktoriyel*i;{
            System.out.println(faktoriyel);}

            System.out.println("");

            //birden 100 kadar olan sayiları toplayin(sinirlar dahil)

            int toplam=0;
            for (int j = 1; j <= 100; j++) {
                toplam=toplam+j;
            }System.out.print(toplam);

            } }



