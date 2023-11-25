package ders31_inheritance;

public class GCorolla extends FToyota{
    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        super();
        System.out.println("Corolla cons. calıstı");
    }

    public static void main(String[] args) {
        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); //Toyota


        /*
        bir child class da obje olusturdugumuzda
        olusturulan obje sadece childe  class a ait ozellikleri degil
        tum parent calss larindaki ozellileri de tasir

        bir class in ozelliklerini tasimasi icin o obje olusturulurken class a ait
        cons. ın calismis olmasi gerekiri
        yani child class indaki obje olusturulurken
        tüm parent class lardaki constructor larda otomatik olarak calisir

        java bun islem icin soyle bir mekanşszma gelistirmistir
        bir constructor olusturdugumuzda biz cons. olusturmasak da
        JAva nın o class a default cons. koygugu GİBİ
        extends keyword kullanan bir classs da olusturlan bir cons.
        ilk satirina biz gormesek de super() constructor call koyar
         */

    }
}
