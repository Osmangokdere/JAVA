package ders21_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydanTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir array deki tekrar eden sayilari bir adet
        //yazdıracak sekilde yazdırın

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        // bu soruyu array'le yapmak cok zor
        // bunun yerine bu array'in elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list'e atalim

        List<Integer> tekrarsizListe= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizListe.contains(arr[i])){
            tekrarsizListe.add(arr[i]);}

        }
        System.out.println("tekrarsiz liste : "+ tekrarsizListe);
        arr=new int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= tekrarsizListe.get(i);


        } System.out.println(Arrays.toString(arr));;





        }
    }

