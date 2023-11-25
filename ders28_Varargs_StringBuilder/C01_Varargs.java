package ders28_Varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);

        //parametre sayisi degistikce bizden yeni parametre olusturmamızı ister.



    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplami : "+(sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami : " +(sayi1+sayi2));

    }
}
