package ders34_overriding_pollymorphism;

public class BChild extends Aparent{
    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        //overriding olabilmesi icin
        //hem method ismi, hemde method signature ayni olmalidir
        System.out.println("child class method 2");
    }
    public void method2(String isim){
        System.out.println("Child class string paremtreli method");
    }

    @Override
    public void method3() {
        //super.method3();
        //overriding varsa parent ve child class daki
        //overridden ve overriding methodlardan sadece biri calisir
        //eger ikisini birden calistirmak isterseniz
        //super.method(3)-method ismi- yazilir

        /*
        overriding method @override notasiyla isaretlenebilir.
        @override kullanilmayan overriding isleminde
        parent class daki overriding methos silinirde
        hic bir sorun olmaz.

        ancak  @override kullanilan overriding isleminde
        parent class daki overriding methos silinirde
        veya signature degistirilirse
        Java CTE verir, boylece overridden methodun
        silinmesi engellenir
         */
    }
}
