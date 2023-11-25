package ders12_forLoops;

public class C05_dikkatEdilecekler {
    public static void main(String[] args) {

        //sonsuz loop
        /*
        for (int i = 0; i>-10 ; i++) {
            System.out.println(i+ " 0");
            */


        //ilk deger icin bitis sartı True olmuyorsa for body i hic devreye giremez
        //kod calisir ancak body calismaz
        for (int i = 0; i>10; i++) {
            System.out.println(i);

            System.out.println("");

            //bir loop un sonunu beklemeden bitimek istersek
            //kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun

            int sayi=230;
            boolean bayrak=false;

            for (int j = 2; j <=sayi-1 ; j++) {

                if (sayi % j==0){
                    // askimiz bitti
                    bayrak=true;
                    //break;
                }
            }


            System.out.println(bayrak);


            if (bayrak){
                System.out.println("asal sayi degil");
            }else {
                System.out.println("asal sayi");
        }


    }}}

