package ders19_Arrays;

import java.util.Arrays;

public class c06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        String str="java";
        str="hava";
        /*var olan bir array in uznlugu degistirilemez
        AMA
        var olan bir array e yeni bir deger atanabilir
         */

        //1-var olan bir array'i yeni deger olarak arayabiliriz.
        String[] arr1={"Ali","Veli"};
        String[] arr2={"A","B","C"};
        arr1=arr2;

        System.out.println(Arrays.toString(arr1));

        //2-istedigimiz uzunluktaki yeni bos bir array degeri ataayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]

        // 3- yeni olusturulan bir array'e { } icinde deger yazarak atama yapabiliriz
        //    ancak var olan bir array'e yeni deger atamasi icin { } KULLANILAMAZ

        // arr1={"g","h"}; olmaz

        int[] arr = {3,4,5};
    }
}
