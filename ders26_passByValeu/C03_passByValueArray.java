package ders26_passByValeu;

import java.util.Arrays;

public class C03_passByValueArray {

    public static void main(String[] args) {
        // verilen bir array in elementlerini 5
        // arturup sonra yazdıran bir method olusturun

        int[] arr={3,4,5};
        elementleri5artir(arr);
        elementleri5artir(arr);
        elementleri5artir(arr);
        System.out.println("method call dan sonra main methods icinde arr "+Arrays.toString(arr));

    }
    public static void elementleri5artir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;


        }System.out.println(Arrays.toString(arr));
    }
}
