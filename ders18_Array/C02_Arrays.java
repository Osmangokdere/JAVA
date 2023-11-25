package ders18_Array;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] arr={"Ali", "Ulus", "Nesrin"};
        //bu array in tum elementlerini aralarında bşr boslkuk burakarak yadırın

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t ");

            //bu array i aray olarak yazdırılım
        }
        System.out.println("");
        System.out.print(arr);
        //array bir obje oldugu icin java reeransını yazdırır
        System.out.println("");

        //array i Array olarka yazdırmak isterseniz Arrays clasından yardım almak zorundasınız

        System.out.println(Arrays.toString(arr)); //[Ali, Ulus, Nesrin]


    }
}
