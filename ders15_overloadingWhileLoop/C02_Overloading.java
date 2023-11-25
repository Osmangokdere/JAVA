package ders15_overloadingWhileLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        carpım(3,5);

    }/*
    bir class da aynı isim ve ayni signature sahip iki method olmaz
    */
    //method overloading olan classlarda java hangi method'un calisacagina su sekilde karar verir.
    //1-once method ismine bakar
    // 2- argument ve parametre uyumuna bakat

    public static void carpım(int sayi1, int sayi2)
    {
        System.out.println(("iki int sayının carpımı" + sayi1 * sayi2));

    }public static void carpım(int sayi3, int sayi4, int sayi5)
    {
        System.out.println(("uc int sayının carpımı" + sayi3 * sayi4*sayi5));

    }public static void carpım(double sayi1, int sayi2)
    {
        System.out.println((" double int iki  sayının carpımı" + sayi1 * sayi2));
}}
