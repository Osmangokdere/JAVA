package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvcikuslar extends EKuslar{
    public void hareket( ) {
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme( ) {
        System.out.println("Avci kuslar et yerler");
    }
    public void pence( ) {
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga( ) {
        System.out.println("Avci kuslar sivri gagalidir");


    }

    public static void main(String[] args) {
        FAvcikuslar avci1=new FAvcikuslar();
        /*
        bir obje olustulurken cons ve data turu ayni ise
        hangi METHOD un gecerli oldugunu bulmak icin
        o class a gider varsa kullaniriz
        yoksa sirasi ile parentlara gider ve ilk buldugunu kullanir

         */
        avci1.beslenme();//avcı kuslar
        avci1.gaga();//avcı kuslar
        avci1.pence();//avcı kuslar
        avci1.hareket();//avcı kuslar
        avci1.cogalma();//kuslar
        avci1.kanat();//kuslar
        avci1.omur();
        avci1.solunum();

        EKuslar avci2=new FAvcikuslar();
        /*
        bir obje olusrulurken data turu ile cons farkli iken;
        hangi METHOD un gecerdli olacag,ni, bulmak icin
        once data turunun oldugu class ve parentlarina bakarak o method u buluruz
        bulamazsak CTE verir.
        bulursak hemedn CALISTIRMAYIZ.
        calıstırmadan once o method override edilmis mi bakarız
        edlmisse o method calıstırılır.
         */
        avci2.beslenme();//Avcı kuslar
        avci2.gaga();//Avcı kuslar
        //avci2.pence();//Avcı kuslar
        avci2.hareket();//Avcı kuslar
        avci2.cogalma();//Kuslar
        avci2.kanat();//Kuslar
        avci2.omur();//HAyvanlar
        avci2.solunum();//Kuslar


        Dhayvanlar avci3=new FAvcikuslar();
        avci3.beslenme();//Avcı kuslar
        //.gaga();//Avcı kuslar
        //avci3.pence();//avcı kuslar
        avci3.hareket();//avcı kuslar
        avci3.cogalma();//kuslar
        //avci3.kanat();//kuslar
        avci3.omur();//Hayvanlar
        avci3.solunum(); //Kuslar
    }
}
