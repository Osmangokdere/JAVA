package ders26_passByValeu;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValeu {
    public static void main(String[] args) {
    //bir method olusturalim
        //listedeki sayilari 5 artırıp yazdiralim
        


        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);

        System.out.println("method call sonrası main method da list" +sayilar);



    }
    public static void elementleri5Artir(List<Integer>sayilar){
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+5);

        }
        System.out.println(sayilar);
    }
    
}
