package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        //java collections icerisndeki bazı class lar index desteklemez
        //Bu durumda index kullnamadan collection icerdisndeki tum elemnetlere ulasabilmek ve
        //onları updade edebilmek icin farklı ihtiyaclar olabilir

        //List<> index ytapisini destekledigi icin boyle bir ihtiyac duymaz
        //ancak bgunluk index kullanmadan list elemnetlerine ulasmaya
        //ve onlari update etmeye calisalim

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        for (Integer each:sayilar
             ) {
            System.out.print(each+ " ");
        }



    }
}
