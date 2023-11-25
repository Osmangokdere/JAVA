package ders18_Array;

import java.util.Arrays;

public class C03_ArrayElemntleriniArtırma {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        for (int i = 0; i < arr.length ; i++) {

            arr[i] =arr[i]+2 ;
        }

        System.out.println(Arrays.toString(arr));  // [4, 6, 8, 10]


        arr= elementleri2Artir(arr);

        System.out.println(Arrays.toString(arr)); // [6, 8, 10, 12]
    }

    public static int[] elementleri2Artir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;
        }

        return arr;
    }}