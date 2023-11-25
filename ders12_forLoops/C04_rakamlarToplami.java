package ders12_forLoops;

public class C04_rakamlarToplami {
    public static void main(String[] args) {
        //kullanicnin verdigi sayinnn rakamlar toplamini bulun

        int sayi=1455665585;
        String sayiStr=""+sayi;

        int birlerBasamagi=2;
        int rakamlarToplami=0;

       for (int i = 1; i <=sayiStr.length(); i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
           sayi = sayi/10;
        }
        System.out.println(rakamlarToplami);




    }}

