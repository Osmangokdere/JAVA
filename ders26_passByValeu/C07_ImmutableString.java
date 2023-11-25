package ders26_passByValeu;

public class C07_ImmutableString {
    public static void main(String[] args) {
        String str="Java Candir";

        str=str.toUpperCase();

        System.out.println(str);// JAVA CANDİR
        /*
        Immutable Class lardan olusturulan bir objenin
        degeri DEGİSTİRİLEMEZ
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur
        ve bu yeni objeye yeni atadiginiz degeri atar

        eski oj-bje bosa cikar ve garbage collector tarafindan silinmeyi bekleri
         */

    }
}
