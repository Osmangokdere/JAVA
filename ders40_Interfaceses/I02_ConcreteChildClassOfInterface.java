package ders40_Interfaceses;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {
    //bir class i bir interface in child i yapmak icin şmlepents keyword kullanilir
    public static void main(String[] args) {
        System.out.println(MESAJ);
        //sayi=40;
        System.out.println(Integer.MAX_VALUE);
        //normalde variable isimleri kucuk harfle baslar ve camelCase kullanilir
        //ancak java da ortak kabul olarak
        //static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir


    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
