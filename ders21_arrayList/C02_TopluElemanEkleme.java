package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        // tum sesli hrfleri listeye ekleyin
        String[] arr={"a", "e", "i","o", "u"};
        for (int i = 0; i < arr.length; i++) {
        harfler.add(arr[i]);
        }
        System.out.println(harfler); //[a, e, i, o, u]
    }
}
