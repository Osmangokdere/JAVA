package ders20_multiDimensionalArrays;

public class C02_MDAelementleriToplama {
    public static void main(String[] args) {
        int[] arr1={3,5,7,8};

        int toplam=0;


        for (int i = 0; i < arr1.length; i++) {
            toplam+=arr1[i];
            System.out.println("tek katli array elementleri toplami : " + toplam);

        }
    }
}
