package ders19_Arrays;

import java.util.Arrays;

public class C02_EnBuyukVeEnKucukElementiBulma {
    public static void main(String[] args) {
        //Verilen bir int array de en kucuk ve en buyuk elementi yazdıran bir method olusturun

        int [] arr={3,8,1,5,2,0,20};

        enBuyukEnKucukELementYazdır(arr);
    }
    public static void enBuyukEnKucukELementYazdır (int[]arr){

        Arrays.sort(arr);
        System.out.println("En buyuk element : "+arr[arr.length-1]+" \nEn kucuk elemant : " + arr[0]);

    }

}
