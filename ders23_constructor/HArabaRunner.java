package ders23_constructor;

public class HArabaRunner {
    public static void main(String[] args) {
        HAraba arb1=new HAraba();
        arb1.marka="Toyota";
        arb1.model="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;
        System.out.println(arb1);

        HAraba arb2=new HAraba("Honda", "Civic","Benzin",2011, 11000);
        System.out.println(arb2);
        HAraba arb3=new HAraba("opel","astra", "benzin", 2011, 15200);
        HAraba arb4=new HAraba("Tesla", "Model X", 2020);
        System.out.println(arb4);

        HAraba arb6=new HAraba("honda", "jazz","lpg",2010,154600);
        System.out.println(arb6);
    }
}
