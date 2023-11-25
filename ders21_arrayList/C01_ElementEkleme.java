package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar); //[ ]

        System.out.println(sayilar.add(10)); //true-yapıp yapmadıgını kontrol etme

        System.out.println(sayilar); //[10] listeye eklendi

        sayilar.add(20);
        System.out.println(sayilar); //tersi soylemedikce elementi sona dogru ekler.
         sayilar.add(1,15); //[10,15,20]
        System.out.println(sayilar);
        sayilar.add(0,44);
        System.out.println(sayilar);

        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar); //[44, 10, 15, 20, 3, 5]

        //sayilar listesinin basında

        sayilar.addAll(1, eklenecekListe);
        System.out.println(sayilar);




    }
}
