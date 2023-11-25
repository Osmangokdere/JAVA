package ders40_Interfaceses;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface, I06_Interface{
   /*
   1- bir class sadece bir class a extens edilebilir
   ancak birden fazla interface e imlements edilebilir

   2-Concrete Child class iölement ettigi
   tum interfacelerdeki abstrack methoslari override etmek zorunda oldugundan
   iki nterface deki tum methıdlari override etmnek gerekir
        -iki interface de ayni isimde ve ayni return type sahip
        methodlardan hangisini override ettigi onemli degildir.
        -Ancak isimler ayni return type lar farkli oldugunda
        iki interface i birden implement etmemmiz mumkun olmayacaktir
        bu durumda
        *) ya child class dan bu iki interface i imlement etmekten vazgecin
        *) veya sisteme mudahalde etme imkaniniz varsa bu conclict i cozmelisiniz

        3- Child class'dan parent Interface'lerdeki variable'lari kullanmak istersek
           - ayni isimde iki interface'de de variable varsa,
             interfaceIsmi.variableIsmi seklinde tercihinizi belirtmelisiniz
           - kullanacagimiz variable sadece 1 interface'de varsa
             sadece variableismi yazmak yeterli olacaktir

    */
   public static void main(String[] args) {
       System.out.println(I06_Interface.MESAJ);
       System.out.println(I05_Interface.MESAJ);
       System.out.println(SAYI2);
   }
    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
