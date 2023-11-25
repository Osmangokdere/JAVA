package ders26_passByValeu;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByvalueList2{

    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
    }


    public static void yeniListDegerAtama(List<Integer>sayilar) {
        List<Integer>yeniList=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i) + 5);

        }sayilar=yeniList;
        System.out.println("method call dan sonra main method da sayilar :"+ sayilar);

    }}