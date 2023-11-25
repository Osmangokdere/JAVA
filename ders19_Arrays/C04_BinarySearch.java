package ders19_Arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr={1,8,9,3,7,5,9,4,6};
        System.out.println(Arrays.binarySearch(arr, 1));//0
        System.out.println(Arrays.binarySearch(arr,5)); //-2
        System.out.println(Arrays.binarySearch(arr, 9));
        /*
        Binary Search metodunun dogru sonuclar verebilmesi icin öncelikle sort kullanılmalıdır.
        sort kullnılmadan Binary search in sonucu belli olmaz

         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 1, 3, 4, 5, 6, 7, 8, 9, 9]
        System.out.println(Arrays.binarySearch(arr, 1));//0
        System.out.println(Arrays.binarySearch(arr,5)); //3
        System.out.println(Arrays.binarySearch(arr, 9));//7

        //Array da olmayan bir eleman aratirsak
        //java once o sayi array de olsa nerede olurdu onu bulur
        //sonra buldugu bu SIRA yi - isareti ile verir

        System.out.println(Arrays.binarySearch(arr, -3));//-1
        System.out.println(Arrays.binarySearch(arr,10)); //-10
        System.out.println(Arrays.binarySearch(arr, 100));//-10 olsaydı 10 sırada olurdu. olmadıgı icin - isareti





    }}
