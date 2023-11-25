package ders18_Array;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] arr1={2,4,6,8,10};
        //arr
        System.out.println(arr1[2]);//6
        arr1[3]=20;
        System.out.println(arr1[3]);//20
        System.out.println(arr1.length);////son elementi yazdıralım
        System.out.println(arr1[arr1.length-1]);


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " \t ");

        }
        //array in uzunlugu sonradan degistirilemez
        //eger array'de olmayan bir index e atama yapmak isterse"ArrayIndexOutOfBoundsException"
        //bu hata Compile Time Error CTE degil de
        //Run time Error dur. sonrasında gorur
        //arr1[5]=35;

    }


}
