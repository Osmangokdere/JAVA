package ders39_abstractClass;

public class CHondaCıvıc extends BHonda{


    @Override
    public void motor() {
        System.out.println("vtec");

    }

    @Override
    public void kasa() {
        System.out.println("sedan yafa hb");

    }

    @Override
    public void tekerlek() {
        System.out.println("205/55/06");

    }

    @Override
    public void yakit() {
        System.out.println("benzim");

    }

    @Override
    public void guvenlik() {
        System.out.println("güvenliklidir");
    }

    @Override
    public void Abs() {
        System.out.println("honda civic arabalar abs kullanır");
    }

    @Override
    public void klima() {
        System.out.println("honda civic arabalar klima kullanır");
    }

    public static void main(String[] args) {
        CHondaCıvıc civic1=new CHondaCıvıc();
        civic1.Abs();//cıvıc
        civic1.klima();//cıvıc
        civic1.marka();//Honda
        civic1.ozelTeknoloji();//honda
    }
}
