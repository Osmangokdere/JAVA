package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

                sayilar.add(arr[i]);}
        //List.set(index,YeniDEger) methodu
        //istenen index'teki eski degeri silip bizeyeni degeri yazar

        System.out.println(sayilar.set(0, 8)); //eski degeri de yazar
        sayilar.set(1,9);
        System.out.println(sayilar);
    }
}
