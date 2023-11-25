package ders22_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer[] arr ={1,2,3};
        //verilen bir array i List e cevirmek icin
        //bir list olusturup, for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);

        //bu yönetim iki negatif yönü vardır
        //1- bu sekilde olusturulan listler esnek uzunluga sahip degillerdir

        arraydenList.remove(1); //.UnsupportedOperationException

        //2. negatif yöntem kaynak olan array ile yeni olustulan list birbirini baglar
        // biri degisince digeri de degisir,


    }
}
