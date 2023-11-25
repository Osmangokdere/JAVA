package ders43_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        //verien bir array in tekrar edeneşementler silip
        //her elementlerş sadece bir kere kulllanıldıgı hale gelir

        int[] arr ={1,6,5,8,9,5,9,6,4,5,6,2,3,5,4,7,1};

        Set<Integer> geciciSet=new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }

        arr=new int[geciciSet.size()];

        int index=0;
        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;

        }


       System.out.println(Arrays.toString(arr));
    }
}
