package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        //LinkedList 3 tane interface , imlements etmistir.
        //List,Queue, Deque interfaceleri
        //dolayısıyla bun ineterfacelerdeb sora gelen ilk concerte class oldugundan
        //bu interface deki tum abstract mothodlari override etmistir


        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alir


        List<String>ll2=new LinkedList<>();

        // Daha onceden arrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz


        ll2.add("R");
        System.out.println(ll2);
        System.out.println(ll2.add("F"));
        //System.out.println(ll2);
        System.out.println(ll2.add("A"));
        System.out.println(ll2);


    }
}
