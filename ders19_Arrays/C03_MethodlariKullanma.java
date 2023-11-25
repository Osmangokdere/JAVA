package ders19_Arrays;

import ders18_Array.C03_ArrayElemntleriniArtırma;
import ders18_Array.C04_ArrayElemetleriToplama;
import ders18_Array.C05_ArraydaElemanArama;
import ders18_Array.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {
        //verilen bir int array in elementlerini 2 artırın

        int[] arr={ 2,3,4};
        C03_ArrayElemntleriniArtırma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); //[4, 5, 6]

        //arr array in elemntlerini toplayıp sonucu yazdırın.

        System.out.println(C04_ArrayElemetleriToplama.pozitifElementleriTopla(arr)); //15

        //arr elementinde 10 degeri var mı
        C05_ArraydaElemanArama.elemanAra(arr,10);

        //kullanıcıdan deger alarak bir deger alarak array olusturun

        int[] yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));


    }
}
