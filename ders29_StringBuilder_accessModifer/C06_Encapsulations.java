package ders29_StringBuilder_accessModifer;

import java.util.ArrayList;
import java.util.List;


public class C06_Encapsulations {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);

        System.out.println(sayilar.get(0)); //  get de OKUMAYA izin var ancak YAZMAYA deger atamaya izin yok
                    //sayilar.get(0)=10;    // deger atamaya izin yok

        System.out.println(sayilar.set(1, 10)); //"set" de deger atamasi yapabilirsin ancak okuma yapamazsın
                                // sayilar.set(1); BİR BAKIP CIKACAKTIM OLMAZ... SADECE DEGER ATAMASI YAPABİLİRİSİN


    }}
