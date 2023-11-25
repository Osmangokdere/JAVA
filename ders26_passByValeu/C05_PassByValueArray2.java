package ders26_passByValeu;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {

        //bir method olusturun
        //sayilar Array'in uznlugundan iki fazla olan
        //ve elemetlerin tamami 5 olan yeni bir array olusturup
        //deger olarak sayilar arrray'na atayın ve
        //sayilar Array'inA atayin
        int [] sayilar={3,4,5,6};
        arrayeYeniDegerAta(sayilar);
        System.out.println(Arrays.toString(sayilar));



    }

    public static void arrayeYeniDegerAta(int [] sayilar){

        int[] yeniArray=new int[sayilar.length+2];
        for (int i = 0; i < yeniArray.length; i++) {

            yeniArray[i]=5;

        }
        sayilar=yeniArray;

        System.out.println("method  da sayilarin son hali : "+Arrays.toString(sayilar));
    }
}
