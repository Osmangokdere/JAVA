package ders24_constructors;

public class ArabaRunner {
    public ArabaRunner() {
    }

    public static void main(String[] args) {

    Araba arb1=new Araba();
        arb1.marka="Citreon";
        arb1.model="C";
        arb1.yakit="benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;
        System.out.println(arb1);


        Araba arb2=new Araba("Volvo","CX60");
        System.out.println(arb2);

        Araba arb3=new Araba("Hyundai","i10",10000);
        System.out.println(arb3);

        Araba arb4=new Araba("Porche", "Cayanne","lpg",1990,12000);
        System.out.println(arb4);
    }
}
