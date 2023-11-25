package ders34_overriding_pollymorphism;

public class DChild extends CParent{

    //overriding kurallari
    //1-access modifier methos signature dahil olmadigindan
    //farkli olabilir
    //child parent i sinirlandiramaz...

    public void method1(){

    }
   // 2-Private ve Static methodlar override edilemez
    //ayni isimde methos  olusuturlunca java CTE vermez
    //ancak override isareti cıkmaz
    //@override notastonu kullanilmak istenirse CTE olur
    //yani java bunlari farkli class lardaki farkli mwethodlar olarak kabul eder.
}
