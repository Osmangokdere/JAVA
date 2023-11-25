package ders31_inheritance;

public class DOtomobil extends BinekArac {
    public static void main(String[] args) {
        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);
        /*inheritance sayesinde bir Child class olusturdugumuzda,
        yeni hic bir variable veya method olusturmadan
        parent classlardaki tum ozellikleri almıs oluruz
        Child class da parent dan gelen ozellikleri
        uptade edebilir veya yeni ozellikler ekleyebiriz
         */

    }
}
