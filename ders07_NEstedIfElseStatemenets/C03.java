package ders07_NEstedIfElseStatemenets;

public class C03 {
    public static void main(String[] args) {

        //kullanicidan cinsiyetini ve yasini alın, Kadin, 60 yas uzeri,
        //erkek 65 yas ve uzeri emekli olabilir.
        //cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "emekli olmak icin ... yil daha calisman gerekir" yszırın.

        //nested if else seklinde kullanım icin once ana degiskeni secip oan gore ana yapiyi yapin
        //cinsiyet ana yapı

        //nested if else kullanım için ana degiskeni secip
        //cinsiyet ana degisken

        char cinsiyet='K';
        int yas=56;

        if (cinsiyet=='k' || cinsiyet=='K'){
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if (yas<60) {
                System.out.println("emekli olamazsın daha "+ (60-yas)+ "yıl daha calısmalisin");
            }else{
                System.out.println("emekli olabirsin");}

        } else if (cinsiyet=='e' || cinsiyet== 'E'){
            if (yas<15){
            System.out.println("hatali yas girisi");
            } else if (yas<65) {
                System.out.println("emekli olamazsın daha "+ (65-yas)+ " yıl daha calısmalisin");
        }else{
            System.out.println("emekli olabirsin");}


        }else{
            System.out.println("yanlıs cinsiyet girisi");}
    }
}
