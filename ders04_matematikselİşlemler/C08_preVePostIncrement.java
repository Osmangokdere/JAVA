package ders04_matematikselİşlemler;

public class C08_preVePostIncrement {

    public static void main(String[] args) {

        int x=3;

        int y=2*++x;
        int z=5+y--;

        System.out.println("Yeni X : "+x);
        System.out.println("Yeni Y :" +y);
        System.out.println("Yeni Z :" +z);
        System.out.println("Toplam : " +(x+y+z));

        int sayi=20;

        System.out.println(sayi++);
        System.out.println(sayi);



    }
}
