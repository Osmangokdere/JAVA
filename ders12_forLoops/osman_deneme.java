package ders12_forLoops;

public class osman_deneme {
    public static void main(String[] args) {
        int sayi=233;
        boolean bayrak=false;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                // askimiz bitti
                bayrak=true;
                break;
            }
        }


        System.out.println(bayrak);


        if (bayrak){
            System.out.println("asal sayi degil");
        }else {
            System.out.println("asal sayi");
    }
}}
