package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        int input= 1280;

        System.out.println(tamBolenlerListesiOlustur(input));

    }


    public static List<Integer> tamBolenlerListesiOlustur(int input){

        List<Integer> tamBolenlerListesi= new ArrayList<>();

        for (int i = 1; i <=input ; i++) {

            if (input % i == 0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}