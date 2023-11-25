package ders43_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {
        Set<Integer>sayilar=new HashSet<>();
        sayilar.add(12);
        sayilar.add(15);

        Set<Integer> siraliSet=new TreeSet<>();
        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);
        System.out.println(siraliSet);//[12, 15, 23, 34]
    }


}
