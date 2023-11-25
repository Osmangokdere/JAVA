package ders18_Array;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.


        int [] kullaniciArrayi=arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
    public static int[] arrayOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("olusturulacak array in boyutunu gireniz");
        int lenght=scan.nextInt();

        int[] kullaniciArrayi=new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Array a eklencek bir sayi giriniz");
            kullaniciArrayi[i]=scan.nextInt();
        }
        return kullaniciArrayi;

    }
}
